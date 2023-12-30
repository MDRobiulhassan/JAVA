public class StringBuilderMethos {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Robiul ");
        System.out.println(sb);

        // append
        sb.append(10);
        System.out.println(sb);

        // reverse
        System.out.println(sb.reverse());
    }
}
