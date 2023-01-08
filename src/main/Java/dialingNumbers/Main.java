package dialingNumbers;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = """
                342

                5.34

                756

                1.234e+07

                7.234243E-02

                6.09

                3457

                87

                1.0001

                3

                5""";

        List<Float> flotNumbers = DialingNumbers.getFloatNumbers(text);
        System.out.println("Liczby zmiennoprzecinkowe:\n" + flotNumbers);
        List<Integer> integerNumbers = DialingNumbers.getIntegerNumbers(text);
        System.out.println("Liczby całkowite:\n" + integerNumbers);
        List<String> scientificNotationNumbers = DialingNumbers.getScientificNotationNumbers(text);
        System.out.println("Liczby zapisane w notacji naukowej:\n" + scientificNotationNumbers);


    }
}
