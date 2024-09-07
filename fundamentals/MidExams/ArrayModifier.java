import java.util.Scanner;
import static java.util.Arrays.stream;

public class ArrayModifier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] parts = command.split(" ");
            String action = parts[0];

            if (action.equals("decrease")){
                for(int i = 0;i < array.length; i++){
                    array[i]--;
                }
            } else {
                int index1 = Integer.parseInt(parts[1]);
                int index2 = Integer.parseInt(parts[2]);
                if (action.equals("swap")){
                    int element1 = array[index1];
                    int element2 = array[index2];

                    array[index1] = element2;
                    array[index2] = element1;
                } else if (action.equals("multiply")){
                    array[index1] = array[index1] * array[index2];
                }
            }
            command = scanner.nextLine();
        }

        String[] strings = new String[array.length];
        for(int i = 0; i < array.length; i++){
            strings[i] = Integer.toString(array[i]);
        }
        System.out.println(String.join(", ", strings));
    }
}
