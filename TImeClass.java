import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TImeClass {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh:mm:ss");
        String Formatted =time.format(formatter);

        System.out.println(Formatted);
    }
}
