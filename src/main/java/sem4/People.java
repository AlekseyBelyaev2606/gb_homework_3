package sem4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class People {
    public String name;
    private String surname;
    private String gender;
    private int age;
    private int id;
    private int count = 0;



    public int getId(){
        count++;
        return count;
    }

    public String getInfo(){
        return String.format("id: %d; Name: %s; Фамилия: %s; Пол: %s; Возраст: %d", id, name, surname, gender, age);
    }

    public People(String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.id = getId();
    }

    public String getName(){
        return name;
    }

    public static void AddToArray(ArrayList<People> book){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя ");
        String nameNew = scanner.nextLine();
        System.out.println("Введите фамилию ");
        String surnameNew = scanner.nextLine();
        System.out.println("Введите пол ");
        String genderNew = scanner.nextLine();
        System.out.println("Введите возраст ");
        int ageNew = Integer.parseInt(scanner.nextLine());

        People nextPeople = new People(nameNew,surnameNew,genderNew,ageNew);
        System.out.println(nextPeople.getInfo());
        writeFile(nextPeople.getInfo());
    }

    public static void printArray(ArrayList<People> book) throws IOException {
        FileReader fileReader = new FileReader("Array.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        ArrayList<People> peopleBook = new ArrayList<>();
        ArrayList<String> tempArray = new ArrayList<>();
        while (line != null) {
            line = reader.readLine();
            tempArray.add(line);
        }

        for (int i = 0; i < tempArray.size()-1; i++) {
            String[] array = tempArray.get(i).split("; ");
            for (String elem:array
            ) { System.out.println(elem);
            }
            System.out.println();
        }
    }

    public static void lookPeople(People people) {
        String person = people.toString();
        System.out.println(person);
    }

    public static void writeFile(String str){
        try{
            FileWriter writer = new FileWriter("Array.txt", true);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write(str);
            buffer.newLine();
            buffer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


}
