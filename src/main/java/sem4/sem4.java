package sem4;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static sem4.People.AddToArray;
import static sem4.People.printArray;

public class sem4 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

//        FileReader fileReader = new FileReader("Array.txt");
//        BufferedReader reader = new BufferedReader(fileReader);
//        String line = reader.readLine();
        ArrayList<People> peopleBook = new ArrayList<>();
//        ArrayList<String> tempArray = new ArrayList<>();
//        while (line != null) {
//            line = reader.readLine();
//            tempArray.add(line);
//        }
//
//        for (int i = 0; i < tempArray.size()-1; i++) {
//            String[] array = tempArray.get(i).split("; ");
//            for (String elem:array
//            ) { System.out.println(elem);
//            }
//            System.out.println();
//        }




//            People tempPeople = new People();
        System.out.println("Выберите действие: 1. Вывод справочника, 2. Добавить, 3. Удалить, 4. Поиск по имени");
        int in = scanner.nextInt();
        switch (in){
            case 1:
                printArray(peopleBook);
                break;
            case 2:
                AddToArray(peopleBook);
                break;
            case 3:
                break;
            case 4:
//                getName(peopleBook);
                break;
        }
    }
}



