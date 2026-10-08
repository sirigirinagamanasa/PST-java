import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

    static String timeConversion(String s) {

        DateTimeFormatter input =
                DateTimeFormatter.ofPattern("hh:mm:ssa");

        DateTimeFormatter output =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime time = LocalTime.parse(s, input);

        return time.format(output);
    }

    public static void main(String[] args) {

        String s = "07:05:45PM";

        System.out.println(timeConversion(s));
    }
}