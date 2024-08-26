import java.util.Scanner;
import static java.util.Arrays.stream;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = stream(scanner.nextLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            String[] line = command.split(" ");
            String action = line[0];
            switch (action) {
                case "swap":
                    int index1 = Integer.parseInt(line[1]);
                    int index2 = Integer.parseInt(line[2]);
                    swap(index1, index2, numbers);
                    break;
                case "multiply":
                    int i1 = Integer.parseInt(line[1]);
                    int i2 = Integer.parseInt(line[2]);
                    multiply(i1, i2, numbers);
                    break;
                case "decrease":
                    decrease(numbers);
                    break;
            }

            command = scanner.nextLine();
        }

        String[] stringArray = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            stringArray[i] = String.valueOf(numbers[i]);
        }

        System.out.println(String.join(", ", stringArray));
    }

    private static void swap(int index1, int index2, int[] nums){
        int num1 = nums[index1];
        int num2 = nums[index2];

        nums[index2] = num1;
        nums[index1] = num2;
    }

    private static void decrease(int[] nums){
        for (int i = 0; i < nums.length; i++){
            nums[i]--;
        }
    }

    private static void multiply(int index1, int index2, int[] nums){
        nums[index1] *= nums[index2];
    }
}
