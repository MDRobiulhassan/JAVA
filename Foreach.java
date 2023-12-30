public class Foreach {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int sum = 0;

        for (int i : a) {
            sum += i;
        }
        System.err.println("Sum = " + sum);

    }
}