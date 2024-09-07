import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.util.Arrays.stream;

public class MovingTarget {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> numbers = new ArrayList<Integer>();

        for(int num : arr){
            numbers.add(num);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] parts = command.split(" ");
            String action = parts[0];
            int index = Integer.parseInt(parts[1]);
            int value = Integer.parseInt(parts[2]);

            if (action.equals("Shoot")){
                if (validateIndex(index, numbers.size())){
                    int target = numbers.get(index);
                    target -= value;
                    if (target <= 0){
                        numbers.remove(index);
                    } else {
                        numbers.set(index, target);
                    }
                }
            } else if(action.equals("Add")){
                if (validateIndex(index, numbers.size())){
                    numbers.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if (action.equals("Strike")){
                if (validateIndex(index - value, numbers.size()) &&
                        validateIndex(index + value, numbers.size())){
                    int startIndex = index - value;
                    int times = (index + value) - (index - value) + 1;

                    for(int i = 0; i < times; i++){
                        numbers.remove(startIndex);
                    }
                } else {
                    System.out.println("Strike missed!");
                }
            }
            command = scanner.nextLine();
        }

        String[] result = new String[numbers.size()];
        for (int i = 0; i < numbers.size(); i++){
            result[i] = Integer.toString(numbers.get(i));
        }

        System.out.println(String.join("|", result));
    }

    private static boolean validateIndex(int index, int lenOfList){
        return index >= 0 && index < lenOfList;
    }
}
