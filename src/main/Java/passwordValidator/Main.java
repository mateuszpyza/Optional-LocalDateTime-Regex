package passwordValidator;

public class Main {
    public static void main(String[] args) {

        boolean isCorrectPassword = PasswordValidator.validatePassword("Rumcajs2");
        System.out.println("Hasło poprawne :" + isCorrectPassword);
    }
}
