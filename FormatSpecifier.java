public class FormatSpecifier {
    public static void main(String[] args) {
        int i = 123456789;
        float f = 10.2f;
        double d = 1.0364;
        char c = 'R';

        System.out.printf("Integer i = %d\n", i);
        System.out.printf("Float  f = %.2f\n", f);
        System.out.printf("Double d = %.2f\n", d);
        System.out.printf("Character c = %c\n", c);
    }
}