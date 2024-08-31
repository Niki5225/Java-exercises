import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> list1 = new ArrayList<String>(List.of(scanner.nextLine().split(" ")));
        List<String> list2 = new ArrayList<String>(List.of(scanner.nextLine().split(" ")));

        List<String> result = new ArrayList<String >();

        while (!list1.isEmpty() && !list2.isEmpty()){
            result.add(list1.get(0));
            result.add(list2.get(0));

            list1.remove(0);
            list2.remove(0);

        }

        if(!list1.isEmpty()){
            result.addAll(list1);
        } else if (!list2.isEmpty()){
            result.addAll(list2);
        }

        System.out.println(String.join(" ", result));
    }
}
