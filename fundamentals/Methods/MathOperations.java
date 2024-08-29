import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f", getResult(num1, num2, operation));
    }

    public static double getResult(double number1, double number2, String operation){
        return switch (operation) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            case "/" -> number1 / number2;
            default -> -1;
        };
    }
}
