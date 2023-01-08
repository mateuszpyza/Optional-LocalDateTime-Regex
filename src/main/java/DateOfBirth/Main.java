package DateOfBirth;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] a) {
        LocalDate exampleDateOfBirth = LocalDate.of(2000, Month.APRIL, 7);
        int age = DateOfBirth.getAge(exampleDateOfBirth);
        String dayOfWeek = DateOfBirth.getDayOfYear(exampleDateOfBirth);
        int numberDayOfYear = DateOfBirth.getWeekOfYear(exampleDateOfBirth);
        System.out.println("Mam obecnie " + age + " lata.");
        System.out.println("Urodzłem się w " + dayOfWeek + ".");
        System.out.println("Był to " + numberDayOfYear + " tydzień roku.");
    }
}
