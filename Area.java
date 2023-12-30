import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, base, radius;
        System.out.print("Enter the Height and Base : ");
        height = input.nextDouble();
        base = input.nextDouble();
        System.out.print("Enter the Radius of Circle : ");
        radius = input.nextDouble();
        input.close();

        System.out.println("Area of Triangle = " + (0.5 * height * base));
        System.out.println("Area of Circle = " + (3.1416 * radius * radius));
    }
}