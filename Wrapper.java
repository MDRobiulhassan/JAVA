public class Wrapper {
    public static void main(String[] args) {
        // Autoboxing
        int i = 30;
        Integer a = Integer.valueOf(i);
        System.out.println(a);

        // Unboxing
        Double d = 10.25;
        double e = d.doubleValue();
        System.out.println(e);

        // primitive to string
        i = 30;
        String s = Integer.toString(i);
        System.out.println(s);

        // String to primitive
        s = "32";
        i = Integer.parseInt(s);
        System.out.println(i);

        i = Integer.valueOf(i);
        System.out.println(i);
    }
}