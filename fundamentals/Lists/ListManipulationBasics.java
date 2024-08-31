import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        String[] arr = scanner.nextLine().split(" ");

        Collections.addAll(list, arr);

        String command = scanner.nextLine();

        while (!command.equals("end")){

            String[] parts = command.split(" ");
            String action = parts[0];
            String element = parts[1];

            if(action.equals("Add")){
                list.add(element);
            } else if (action.equals("Remove")){
                list.remove(element);
            } else if(action.equals("RemoveAt")){
                int number = Integer.parseInt(element);
                list.remove(number);
            } else if(action.equals("Insert")){
                int index = Integer.parseInt(parts[2]);
                list.add(index, element);
            }

            command = scanner.nextLine();
        }

        System.out.println(String.join(" ", list));

    }
}