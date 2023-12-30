import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateClass {
    public static void main(String[] args) {
        Date date = new Date();

        DateFormat dateformat = new SimpleDateFormat("MM/dd/YYYY");
        String currentdate = dateformat.format(date);
        System.out.println(currentdate);
    }
}