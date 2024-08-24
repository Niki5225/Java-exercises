import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int numCopy = number;

        int sum = 0;

         while (number > 0){
             int digit = number % 10;
             sum += factorial(digit);
             number /= 10;
         }

         if (sum == numCopy){
             System.out.println("yes");
         } else {
             System.out.println("no");
         }

    }

    public static int factorial(int num){
        int result = 1;
        for (int i = num; i > 1; i--){
            result *= i;
        }
        return result;
    }
}
