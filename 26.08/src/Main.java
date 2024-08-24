import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Main {
    private static final String LOGIN_REGEX = "^[a-zA-Z][a-zA-Z0-9_]{2,14}$";
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
    public static HashMap<String, String> credentials = new HashMap<>();

    public Main() {
        credentials.put("login", "password");
    }

    public static void handleSimpleExceptions() {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkBalance(50, 100);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            divide(10, 0);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void handleResourceExceptions() {
        try (BufferedReader reader = new BufferedReader(new FileReader("resources.txt"))) {
            String line = reader.readLine();
            String login = line.split(" ")[0];
            String password = line.split(" ")[1];
            register(login, password);
            login(login, password);
        } catch (InvalidCredentialsException | InvalidFormatException | IOException e) {
            System.out.println(e.getMessage());;
        }
    }

    private static void login(String login, String password) throws InvalidCredentialsException {
        if (checkCredentials(login, password)) System.out.println("Login successful");
        else throw new InvalidCredentialsException("Invalid credentials");
    }

    private static void register(String login, String password) throws InvalidFormatException {
        if (checkFormat(login, password)) {
            credentials.put(login, password);
        } else {
            throw new InvalidFormatException("Login should start with a letter and is 3-15 characters long\n" +
                    "Password must be 8-20 characters and must contain a digit, uppercase letter and special character");
        }
    }

    private static boolean checkFormat(String login, String password) {
        return Pattern.matches(LOGIN_REGEX, login) && Pattern.matches(PASSWORD_REGEX, password);
    }

    private static boolean checkCredentials(String login, String password) {
        return credentials.get(login).equals(password);
    }

    private static void divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) throw new DivisionByZeroException("Cannot divide by zero.");
        System.out.println("Result: " + a / b);
    }

    private static void checkBalance(double balance, double withdrawAmount) throws InsufficientBalanceException {
        if (balance < withdrawAmount)
            throw new InsufficientBalanceException("Insufficient balance to perform withdrawal");
    }

    private static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age must be at least 18.");
    }

    public static void main(String[] args) {
        System.out.println("Handling exceptions using simple try-catch:");
        handleSimpleExceptions();

        System.out.println("\nHandling exceptions using try-with-resources:");
        handleResourceExceptions();
    }
}