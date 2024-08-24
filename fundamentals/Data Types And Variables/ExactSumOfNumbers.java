import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < numbers; i++){
            String line = scanner.nextLine();
            BigDecimal num = new BigDecimal(line);
            sum = sum.add(num);
        }

        System.out.println(sum);
    }
}
