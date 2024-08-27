import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> loot = new ArrayList<String>(Arrays.stream(scanner.nextLine().split("\\|")).toList());

        String command = scanner.nextLine();

        while(!command.equals("Yohoho!")){
            String[] parts = command.split(" ");
            String action = parts[0];

            if(action.equals("Loot")){
                for (int i = 1; i < parts.length; i++){
                    if (!loot.contains(parts[i])){
                        loot.add(0, parts[i]);
                    }
                }
            } else if (action.equals("Drop")){
                int itemIndex = Integer.parseInt(parts[1]);

                if (!(itemIndex >= 0 && itemIndex < loot.size())){
                    command = scanner.nextLine();
                    continue;
                }
                String item = loot.get(itemIndex);
                loot.remove(itemIndex);
                loot.add(item);
            } else {
                int count = Integer.parseInt(parts[1]);

                if (count >= loot.size()){
                    System.out.println(String.join(", ", loot));
                    loot = new ArrayList<String>();
                } else {
                    String[] itemsStolen = new String[count];
                    int startIndex = (loot.size()) - count;
                    int currentIndex = 0;

                    for (int i = startIndex; i < loot.size(); i++){
                        itemsStolen[currentIndex] = loot.get(i);
                        currentIndex++;
                    }

                    for (int j = 0; j < count; j++){
                        loot.remove(loot.size() - 1);
                    }
                    System.out.println(String.join(", ", itemsStolen));
                }
            }

            command = scanner.nextLine();
        }

        if(loot.isEmpty()){
            System.out.println("Failed treasure hunt.");
        } else {
            double sumOfAllLengths = 0;
            int totalItems = loot.size();

            for(String item : loot){
                sumOfAllLengths += item.length();
            }

            double averageTreasureGain = sumOfAllLengths / totalItems;

            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasureGain);
        }

    }
}
