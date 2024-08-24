import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int lostGames = scanner.nextInt();
        double headsetPrice = scanner.nextDouble();
        double mousePrice = scanner.nextDouble();
        double keyboardPrice = scanner.nextDouble();
        int keyboardTrashed = 0;
        double displayPrice = scanner.nextDouble();
        double rageExpenses = 0;


        for(int i = 1; i <= lostGames; i++){
            if (i % 6 == 0) {
                rageExpenses += keyboardPrice;
                rageExpenses += mousePrice;
                rageExpenses += headsetPrice;
                keyboardTrashed++;
                if (keyboardTrashed % 2 == 0 && keyboardTrashed != 0) {
                    rageExpenses += displayPrice;
                }
            } else if(i % 3 == 0){
                rageExpenses += mousePrice;
            } else if (i % 2 == 0){
                rageExpenses += headsetPrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
