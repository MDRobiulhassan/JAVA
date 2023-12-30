import java.util.ArrayList;

public class ArrayListRemoveing {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        // adding element
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        System.out.print("Initial List : ");
        System.out.println(number);

        number.remove(0);
        System.out.println(number);
        number.remove(0);
        System.out.println(number);
        number.remove(0);
        System.out.println(number);
        number.remove(0);
        System.out.println(number);
        number.remove(0);
        System.out.println(number);

        // adding element
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        System.out.print("Initial List : ");
        System.out.println(number);

        // removeAll() method
        number.removeAll(number);
        System.out.println(number);

        // adding element
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        System.out.print("Initial List : ");
        System.out.println(number);

        // clear() method
        number.clear();
        System.out.println(number);
    }
}
