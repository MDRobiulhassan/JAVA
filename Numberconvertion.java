public class Numberconvertion {
    public static void main(String[] args) {
        // binary to decimal
        String binary = "10101";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);

        // Octal to decimal
        String octal = "675";
        decimal = Integer.parseInt(octal, 8);
        System.out.println(decimal);

        // Hexa to deci
        String hexadecimal = "A";
        decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println(decimal);
        
    }
}