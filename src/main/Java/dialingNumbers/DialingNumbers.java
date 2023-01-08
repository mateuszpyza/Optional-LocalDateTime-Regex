package dialingNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DialingNumbers {
    public static List<Float> getFloatNumbers(String text) {
        if (text == null) {
            System.out.println("Input data is null!");
            return null;
        }
        Pattern floatNumberPattern = Pattern.compile("\\b\\d+\\.\\d+\\b");
        Matcher matcher = floatNumberPattern.matcher(text);
        List<Float> floatNumbers = new ArrayList();
        while (matcher.find()) {
            floatNumbers.add(Float.parseFloat(matcher.group()));
        }
        return floatNumbers;
    }

    public static List<Integer> getIntegerNumbers(String text) {
        if (text == null) {
            System.out.println("Input data is null!");
            return null;
        }
        Pattern integerNumberPattern = Pattern.compile("(?<!\\.)\\b[1-9]+\\b(?!\\.)");
        Matcher matcher = integerNumberPattern.matcher(text);
        List<Integer> integerNumbers = new ArrayList();
        while (matcher.find()) {
            integerNumbers.add(Integer.parseInt(matcher.group()));
        }
        return integerNumbers;
    }

    public static List<String> getScientificNotationNumbers(String text) {
        if (text == null) {
            System.out.println("Input data is null!");
            return null;
        }
        Pattern scientificNotationNumberPattern = Pattern.compile("\\b\\d+\\.\\d+\\w(\\-|\\+)\\d+\\b");
        Matcher matcher = scientificNotationNumberPattern.matcher(text);
        List<String> scientificNotationNumbers = new ArrayList();
        while (matcher.find()) {
            scientificNotationNumbers.add(matcher.group());
        }
        return scientificNotationNumbers;
    }

}
