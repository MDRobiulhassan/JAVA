
//import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListcreate {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        // add method
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        // printing by System.out
        System.out.println(number);

        // printing by for each
        for (int i : number) {
            System.out.print(i + " ");
        }

        System.out.println();
        //printing by iterator
        Iterator<Integer> itr = number.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }
}
