package sem4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class People {
    private String name;
    private String surname;
    private String gender;
    private int age;
    private int id;

    public People(String name, String surname, String gender, int age, int id) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public static <Gson> ArrayList<People> AddToArray(ArrayList<People> book){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя ");
        String nameNew = scanner.nextLine();
        System.out.println("Введите фамилию ");
        String surnameNew = scanner.nextLine();
        System.out.println("Введите пол ");
        String genderNew = scanner.nextLine();
        System.out.println("Введите возраст ");
        int ageNew = Integer.parseInt(scanner.nextLine());
        int idNew = 0;
        for (int i = 0; i < book.size(); i++) {
            People idTemp = book.get(i);
                if (idTemp.id > idNew){
                    idNew = idTemp.id;
                }
        }
        People nextPeople = new People(nameNew, surnameNew, genderNew, ageNew, idNew+1);
        book.add(nextPeople);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try{
            FileWriter writer = new FileWriter("Array.txt");
            gson.toJson(book, writer);
            writer.flush();
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return book;
    }

    public static void printArray(ArrayList<People> book){
        for(People elem: book){
            System.out.println(elem.name);
            System.out.println(elem.surname);
            System.out.println(elem.age);
            System.out.println(elem.gender);
        }
    }

}
