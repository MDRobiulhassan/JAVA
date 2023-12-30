import java.util.ArrayList;

public class ArrayListisEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        System.out.print("Initial List : ");
        System.out.println(number);
        
        boolean b;
        b=number.isEmpty();
        System.out.println("List is Empty : "+b);

        number.clear();
        b=number.isEmpty();
        System.out.println("List is Empty : "+b);
        

    }
}
