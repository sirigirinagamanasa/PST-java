import java.time.LocalDate;

public class DayOfTheYear {

    static int dayOfYear(String date) {

        LocalDate d = LocalDate.parse(date);

        return d.getDayOfYear();
    }

    public static void main(String[] args) {

        String date = "2019-02-10";

        System.out.println(dayOfYear(date));
    }
}
