import java.time.LocalDate;

public class JavaDateAndTime {

    static String getDay(int month, int day, int year) {

        LocalDate date = LocalDate.of(year, month, day);

        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {

        int month = 8;
        int day = 14;
        int year = 2017;

        System.out.println(getDay(month, day, year));
    }
}
