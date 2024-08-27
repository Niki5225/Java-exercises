import java.util.Scanner;

public class Calculations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        switch (operation){
            case "add":
                System.out.println(add(number1, number2));
                break;
            case "subtract":
                System.out.println(subtract(number1, number2));
                break;
            case "multiply":
                System.out.println(multiply(number1, number2));
                break;
            case "divide":
                System.out.println(divide(number1, number2));
                break;
        }
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }


    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int divide(int num1, int num2){
        return num1 / num2;
    }
}
