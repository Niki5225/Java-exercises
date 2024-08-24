import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= totalNumbers; i++) {
            int currentNumber = i;
            while (currentNumber > 0) {
                sum += currentNumber % 10;
                currentNumber = currentNumber / 10;
            }
            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial){
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
            sum = 0;
        }

    }
}
