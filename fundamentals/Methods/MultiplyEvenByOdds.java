import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String element = scanner.nextLine();

        System.out.println(getResult(element));
    }

    public static int getResult(String el){
        int sumOfAllEvenDigits = 0;
        int sumOfAllOddDigits = 0;

        for(int i = 0; i < el.length(); i++){
            int digit = Character.getNumericValue(el.charAt(i));

            if (digit % 2 == 0){
                sumOfAllEvenDigits += digit;
            } else {
                sumOfAllOddDigits += digit;
            }
        }

        return sumOfAllEvenDigits * sumOfAllOddDigits;
    }
}
