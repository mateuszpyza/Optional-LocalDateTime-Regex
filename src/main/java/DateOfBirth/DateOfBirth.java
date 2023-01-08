package DateOfBirth;

import java.time.LocalDate;
import java.time.temporal.ChronoField;


public class DateOfBirth {
    public static int getAge(LocalDate date) {
        return LocalDate.now().getYear() - date.getYear();
    }

    public static String getDayOfYear(LocalDate date) {

        return switch (date.getDayOfWeek()) {
            case MONDAY -> "poniedziałek";
            case TUESDAY -> "wtorek";
            case WEDNESDAY -> "środa";
            case THURSDAY -> "czwartek";
            case FRIDAY -> "piątek";
            case SATURDAY -> "sobota";
            case SUNDAY -> "niedziela";
        };
    }

    public static int getWeekOfYear(LocalDate date) {
        return date.get(ChronoField.ALIGNED_WEEK_OF_YEAR);

    }
}
