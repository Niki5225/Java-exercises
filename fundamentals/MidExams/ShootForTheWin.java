import java.util.Scanner;
import static java.util.Arrays.stream;

public class ShootForTheWin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int shotTargets = 0;
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            int index = Integer.parseInt(command);

            if (index >= 0 && index < array.length){
                if (array[index] != -1){
                    int currentTarget = array[index];
                    array[index] = -1;
                    shotTargets++;
                    for (int i = 0; i < array.length; i++){
                        if (array[i] != -1){
                            if (array[i] > currentTarget){
                                array[i] -= currentTarget;
                            } else {
                                array[i] += currentTarget;
                            }
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        String[] result = new String[array.length];
        for(int i = 0; i < array.length; i++){
            result[i] = Integer.toString(array[i]);
        }
        System.out.printf("Shot targets: %d -> %s", shotTargets, String.join(" ", result));
    }
}
