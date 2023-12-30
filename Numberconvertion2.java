public class Numberconvertion2 {
    public static void main(String[] args) {
        // Decimal to binay
        int decimal = 15;
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);

        // decimal to octal
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);

        // decimal to hexadecimal
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println(hexadecimal);
    }
}
