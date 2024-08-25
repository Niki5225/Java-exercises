import java.util.Scanner;
import static java.util.Arrays.stream;

public class EvenAndOddSubtraction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] array = stream(scanner.nextLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int number : array){
            if (number % 2 == 0){
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        System.out.println(sumEven - sumOdd);
    }
}
