import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        System.out.println(number);

        number2.addAll(number);
        System.out.println(number2);
    }
}
