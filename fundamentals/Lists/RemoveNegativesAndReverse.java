import java.util.*;


public class RemoveNegativesAndReverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).filter(x -> x >= 0).toArray();

        for(int positiveNum : array ) {
            list.add(positiveNum);
        }

        Collections.reverse(list);


        if (!list.isEmpty()){
            List<String> stringList = list.stream().map(x -> Integer.toString(x)).toList();
            System.out.println(String.join(" ", stringList));
        } else {
            System.out.println("empty");
        }

    }
}
