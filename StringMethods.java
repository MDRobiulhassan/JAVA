public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("Robiul Hassan");
        String s2 = new String("robiul hassan");

        // Lenght of string
        System.out.println("The length of the string is " + s1.length());

        // Compare
        boolean b = s1.equals(s2);
        System.out.println(b);

        b = s1.contains(s2);
        System.out.println(b);

        b = s1.equalsIgnoreCase(s2);
        System.out.println(b);

        // Check if String is Empty or Not
        b = s1.isEmpty();
        System.out.println(b);

        // Concat
        String s3 = s1.concat(s2);
        System.out.println(s3);

        // Upper and Lowercase convert
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());

        // Start and end value check
        System.out.println(s1.startsWith("Robi"));
        System.out.println(s2.startsWith("Eip"));

        // Character at index
        char ch = s1.charAt(0);
        System.out.println(ch);

        // Ascii Value
        int val = s1.codePointAt(0);
        System.out.println(val);

        // Index of Character
        int pos = s1.indexOf('H');
        System.out.println(pos);

        // Last index of a Character
        pos = s1.lastIndexOf('a');
        System.out.println(pos);

        // Replace
        System.err.println(s1.replace('s', 'm'));

        // split
        String[] str = s1.split(" ");
        for (String i : str) {
            System.err.println(i);
        }

    }
}
