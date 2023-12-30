import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        System.out.println("Enter two numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        input.close();
        int flag = 0;
        for (int i = a; i <= b; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.print(i + " ");
            flag=0;
        }
    }
}