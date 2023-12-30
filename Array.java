import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Enter the Size of Array : ");
        n = input.nextInt();

        double[] a = new double[n];
        System.out.print("Enter the Array Elements ");

        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextDouble();
            sum += a[i];
        }

        input.close();

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum / a.length));

    }
}