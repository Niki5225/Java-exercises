import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= number; i++){
            int sum = 0;
            int currentNum = i;
            while(currentNum > 0){
                int digit = currentNum % 10;
                sum += digit;
                currentNum /= 10;
            }
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True", i);
            } else {
                System.out.printf("%d -> False", i);
            }
            System.out.println();
        }
    }
}
