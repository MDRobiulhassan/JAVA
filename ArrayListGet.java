import java.util.ArrayList;

public class ArrayListGet {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        System.out.println(number);

        int value = number.get(2);
        System.out.println("Index of 2 value is : " + value);
    }
}
