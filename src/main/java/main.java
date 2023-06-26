import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


//Формат сдачи: ссылка на подписанный git-проект.
//
//        Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение
public class main {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            array.add(new Random().nextInt(0,15));
        }
        System.out.println(array);
        System.out.println(minMeaning(array) + " Минимальное значение");
        System.out.println(maxMeaning(array) + " Максимальное значение");
        System.out.println(avarageMeaning(array) + " Среднее значение");
        System.out.println(oddNumbers(array) + " Нечетные числа");





    }
    public static ArrayList<Integer> oddNumbers(ArrayList<Integer> array){
        array.removeIf(n -> (n % 2 == 0));
        return array;
    }

    public static int minMeaning(ArrayList<Integer> array){
        Collections.sort(array);
        return array.get(0);
    }

    public static int maxMeaning(ArrayList<Integer> array) {
        Collections.sort(array);
        return array.get(array.size() - 1);
    }

    public static int avarageMeaning(ArrayList<Integer> array) {
        int sum = 0;
        int avarage = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        return sum / array.size();
    }
}
