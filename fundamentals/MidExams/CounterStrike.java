import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int wonBattles = 0;

        String command = scanner.nextLine();
        while (!command.equals("End of battle")){
            int distance = Integer.parseInt(command);
            if (energy >= distance){
                energy -= distance;
                wonBattles++;
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, energy);
                return;
            }

            if (wonBattles % 3 == 0){
                energy += wonBattles;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", wonBattles, energy);
    }
}
