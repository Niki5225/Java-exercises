import java.util.Scanner;

public class SignOfIntegers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        System.out.printf("The number %d is %s.", number, intSign(number));
    }

    public static String intSign(int number){
        if (number > 0){
            return "positive";
        } else if (number < 0){
            return "negative";
        } else {
            return "zero";
        }
    }
}
