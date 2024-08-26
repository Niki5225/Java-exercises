import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");

        int[] numbers = new int[elements.length];

        for(int i = 0; i < elements.length; i++){
            int num = Integer.parseInt(elements[i]);
            numbers[i] = num;
        }

        boolean indexFound = false;

        for (int j = 0; j < numbers.length; j++){
            int leftSum = calculateLeftSum(j, numbers);
            int rightSum = calculateRightSum(j, numbers);

            if (leftSum == rightSum){
                System.out.println(j);
                indexFound = true;
                break;
            }
        }

        if (!indexFound){
            System.out.println("no");
        }

    }

    public static int calculateLeftSum(int endIndex, int[] array){
        int sum = 0;

        for(int i = 0; i < endIndex; i++){
            sum += array[i];
        }
        return sum;
    }

    public static int calculateRightSum(int startIndex, int[] array){
        int sum = 0;

        for(int i = startIndex + 1; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
