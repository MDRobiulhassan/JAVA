import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListcreate2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        // add method
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        // print
        System.out.println(number);

        // add method with index
        number.add(4, 4);
        number.add(3, 3);
        number.add(1, 1);
        number.add(2, 2);
        number.add(0, 0);

        // printing Normally
        System.out.println(number);

        // for each loop
        for (int i : number) {
            System.out.print(i + " ");
        }

        System.out.println();
        // iterator
        Iterator<Integer> itr = number.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
