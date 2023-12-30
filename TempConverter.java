import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcius, farenhite;

        System.out.print("Enter the Celcius Temperature : ");
        celcius = input.nextDouble();
        farenhite = (9.0 / 5.0) * celcius + 32;
        System.out.println("Farenhite Temperature : " + farenhite);

        System.out.print("Enter the Farenhite Temperature : ");
        farenhite = input.nextDouble();
        celcius = (5.0 / 9.0) * (farenhite - 32);
        System.out.println("Celcius Temperature : " + celcius);

        //Due to Integer Division Problem 5 and 9 assumed as 5.0 and 9.0 

        input.close();
    }
}
