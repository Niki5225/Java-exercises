import java.util.Scanner;
import static java.util.Arrays.stream;

public class MagicSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = stream(scanner.nextLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i< numbers.length; i++){
            int num1 = numbers[i];
            for (int j = i + 1; j < numbers.length; j++){
                int num2 = numbers[j];
                if (num1 + num2 == magicSum){
                    System.out.printf("%d %d%n", num1, num2);
                }
            }
        }
    }
}
