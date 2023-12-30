import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        System.out.print("Enter Your Age : ");
        age = input.nextInt();

        if (age >= 18)
            System.out.println("Valid Voter");
        else
            System.out.println("Not Valid Voter");

        input.close();
    }
}