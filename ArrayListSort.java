import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(77);
        number.add(12);
        number.add(101);
        number.add(99);
        number.add(52);

        System.out.println("Initial List : " + number);

        Collections.sort(number);
        System.out.println("Ascending order : " + number);

        Collections.sort(number, Collections.reverseOrder());
        System.out.print("Decsending order : " + number);
    }
}
