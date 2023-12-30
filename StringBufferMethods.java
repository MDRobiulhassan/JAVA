public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        // append
        sb.append("Robiul");
        sb.append(" Hassan");
        System.out.println(sb);

        // reverse
        System.out.println(sb.reverse());

        // Delete
        System.out.println(sb.delete(0, 6));

        //Adjust Lenght
        sb.setLength(4);
        System.out.println(sb);
    }
}