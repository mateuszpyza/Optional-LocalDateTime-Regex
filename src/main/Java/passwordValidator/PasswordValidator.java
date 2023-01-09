package passwordValidator;


import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean validatePassword(String password) {
        if (password == null) {
            System.out.println("Input data is null!");
            return false;
        }
        int currentYear = LocalDate.now().getYear();
        Pattern passwordContain = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[A-Z])[A-Za-z\\d]{7,}$");
        Pattern passwordNotContainYear = Pattern.compile("(^((?!" + currentYear + ").)*$)");
        Pattern passwordNotContainLastDigitsOfYear = Pattern.compile("(^((?!" + (currentYear - 2000) + ").)*$)");
        Matcher matcher = passwordContain.matcher(password);
        Matcher isNotContainYear = passwordNotContainYear.matcher(password);
        Matcher isNotContainLastDigitsOfYear = passwordNotContainLastDigitsOfYear.matcher(password);
        return matcher.matches() && isNotContainYear.matches() && isNotContainLastDigitsOfYear.matches();
    }
}

