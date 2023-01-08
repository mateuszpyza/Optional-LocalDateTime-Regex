package pesel;

public class Main {
    public static void main(String[] args) {

        boolean peselIsCorrect = PeselValidator.validatePesel("11111111111");

        System.out.println("Pesel jest poprawny: " + peselIsCorrect);
    }
}
