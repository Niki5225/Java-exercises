import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import static java.util.Arrays.stream;

public class MemoryGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> list = stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        int numberOfMoves = 0;

        while (true){
            String command = scanner.nextLine();
            if (command.equals("end")){
                break;
            }


            int[] indices = stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int index1 = indices[0];
            int index2 = indices[1];
            numberOfMoves++;

            if ((index1 > list.size() - 1 || index1 < 0) || (index2 > list.size() - 1 || index2 < 0) || index1 == index2){
                System.out.println("Invalid input! Adding additional elements to the board");
                int middleIndex = list.size() / 2;
                String elementToAdd = "-" + numberOfMoves + "a";
                list.add(middleIndex, elementToAdd);
                list.add(middleIndex, elementToAdd);
                continue;
            }

            String element1 = list.get(index1);
            String element2 = list.get(index2);
            if (element1.equals(element2)){
                System.out.printf("Congrats! You have found matching elements - %s!", list.get(index1));
                System.out.println();
                list.remove(element1);
                list.remove(element2);

            } else{
                System.out.println("Try again!");
            }
            if(list.isEmpty()){
                System.out.printf("You have won in %s turns!", numberOfMoves);
                return;
            }
        }
        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ", list));
    }
}
