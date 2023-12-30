import java.util.Scanner;

public class Recursion {
    int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Recursion ob = new Recursion();
        int num;
        System.out.println("Enter a Number ");
        num = input.nextInt();
        System.out.println(ob.factorial(num));
        input.close();
    }
}