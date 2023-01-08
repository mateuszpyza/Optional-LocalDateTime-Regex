package pesel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {
    public static boolean validatePesel(String pesel) {
        if (pesel == null) {
            System.out.println("Input data is null!");
            return false;
        }
        Pattern peselPattern = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        Matcher matcher = peselPattern.matcher(pesel);
        return matcher.matches();
    }
}
