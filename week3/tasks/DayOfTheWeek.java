import java.time.LocalDate;

public class DayOfTheWeek {

    static String dayOfTheWeek(int day, int month, int year) {

        LocalDate date = LocalDate.of(year, month, day);

        String name = date.getDayOfWeek().toString();

        return name.substring(0, 1)
                + name.substring(1).toLowerCase();
    }

    public static void main(String[] args) {

        int day = 31;
        int month = 8;
        int year = 2019;

        System.out.println(dayOfTheWeek(day, month, year));
    }
}
