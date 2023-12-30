import java.util.Scanner;

public class Array_max_min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Enter the Size of Array : ");
        n = input.nextInt();

        int[] a = new int[n];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        input.close();

        int max = a[0], min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }

        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
    }
}
