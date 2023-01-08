package urlValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {
    public static boolean validateUrl(String url) {
        if (url == null) {
            System.out.println("Input data is null!");
            return false;
        }
        Pattern urlPattern = Pattern.compile("https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}");
        Matcher matcher = urlPattern.matcher(url);
        return matcher.matches();
    }
}
