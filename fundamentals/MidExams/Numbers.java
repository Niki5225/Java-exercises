import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.util.Arrays.stream;

public class Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> nums = new ArrayList<Integer>();

        int sum = 0;
        for(int element : numbers){
            nums.add(element);
            sum += element;
        }

        int average = sum / nums.size();

        List<Integer> filtered = nums.stream().filter(x -> x > average).sorted((x, y) -> y.compareTo(x)).toList();
        List<String> biggerThanAverage = filtered.stream().map(x -> Integer.toString(x)).toList();


        if (biggerThanAverage.isEmpty()){
            System.out.println("No");
        } else {
            for(int i = 0; i < Math.min(5, biggerThanAverage.size()); i++){
                System.out.print(biggerThanAverage.get(i) + " ");
            }
        }

    }
}
