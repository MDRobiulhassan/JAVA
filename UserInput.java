import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        float f;
        double d;
        char c;
        String s, s2;

        // User Input
        System.out.print("Enter a Integer : ");
        i = input.nextInt();
        System.out.print("Enter a Float : ");
        f = input.nextFloat();
        System.out.print("Enter a Double : ");
        d = input.nextDouble();
        System.out.print("Enter a Character : ");
        c = input.next().charAt(0);

        // To stop input Buffering
        input.nextLine();
        System.out.print("Enter a String : ");
        s = input.nextLine();
        System.out.print("Enter a String : ");
        s2 = input.next();
      
        // Output
        System.out.println("Integer = " + i);
        System.out.println("Float = " + f);
        System.out.println("Double = " + d);
        System.out.println("Character = " + c);
        System.out.println("String 1 = " + s);
        System.out.println("String 2 = " + s2);
        input.close();
    }
}
