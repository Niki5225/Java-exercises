import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;
        int oddNumbers = 0;

        for (int i = 0; oddNumbers < number; i++){
            if (i % 2 != 0){
                System.out.println(i);
                oddNumbers++;
                sum += i;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
