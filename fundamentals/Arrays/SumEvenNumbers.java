import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsString = line.split(" ");

        int[] numbers = new int[numbersAsString.length];

        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        int sumEven = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            }
        }

        System.out.println(sumEven);
    }
}
