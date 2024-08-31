import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import static java.util.Arrays.stream;

public class ListManipulationAdvanced {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> list = new ArrayList<Integer>();

        for(int num : arr){
            list.add(num);
        }

        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] parts = command.split(" ");

            String action = parts[0];

            if(action.equals("Contains")){
                int number = Integer.parseInt(parts[1]);
                if (list.contains(number)){
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (action.equals("Print")){
                List<String> result = new ArrayList<String>();
                if (parts[1].equals("even")){
                    for (int num : list){
                        if(num % 2 == 0){
                            String element = Integer.toString(num);
                            result.add(element);
                        }
                    }
                } else {
                    for (int num : list){
                        if(num % 2 != 0){
                            String element = Integer.toString(num);
                            result.add(element);
                        }
                    }
                }



                System.out.println(String.join(" ",result));
            } else if (action.equals("Get")){
                int sum = 0;
                for (int num : list) {
                    sum += num;
                }
                System.out.println(sum);
            } else if (action.equals("Filter")){
                String condition = parts[1];
                int number = Integer.parseInt(parts[2]);

                Predicate<Integer> filterCondition = null;

                switch (condition) {
                    case ">":
                        filterCondition = n -> n > number;
                        break;
                    case ">=":
                        filterCondition = n -> n >= number;
                        break;
                    case "<":
                        filterCondition = n -> n < number;
                        break;
                    case "<=":
                        filterCondition = n -> n <= number;
                        break;
                    case "==":
                        filterCondition = n -> n == number;
                        break;
                    default:
                        System.out.println("Invalid condition.");
                        return;
                }

                List<Integer> filtered = list.stream().filter(filterCondition).toList();

                List<String> result = filtered.stream().map(x -> Integer.toString(x)).toList();

                System.out.println(String.join(" ", result));
            }


            command = scanner.nextLine();
        }
    }
}
