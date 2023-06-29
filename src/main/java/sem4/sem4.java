package sem4;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import static sem4.People.AddToArray;
import static sem4.People.printArray;

public class sem4 {

    public static void main(String[] args) {
        ArrayList<People> peopleBook = new ArrayList<>();

        AddToArray(peopleBook);
        printArray(peopleBook);



    }

}



