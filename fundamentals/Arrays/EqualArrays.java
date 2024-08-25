import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        boolean areEqual = true;

        for(int i = 0; i < array1.length; i++){
            if (!array1[i].equals(array2[i])){
                areEqual = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }

        if (areEqual){
            int sum = 0;
            for (String num : array1){
                sum += Integer.parseInt(num);
            }
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
