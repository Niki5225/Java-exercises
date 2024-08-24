import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double nutsPrice = 2;
        double waterPrice = 0.7;
        double crispsPrice = 1.5;
        double sodaPrice = 0.8;
        double cokePrice = 1;

        String command = scanner.nextLine();
        double totalMoneyInserted = 0;

        while(!command.equals("Start")){
            double coin = Double.parseDouble(command);
            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1 && 2 != coin){
                System.out.printf("Cannot accept %.2f", coin);
                System.out.println();
            } else {
                totalMoneyInserted += coin;
            }
            command = scanner.nextLine();
        }

        String nextCommand = scanner.nextLine();


        while(!nextCommand.equals("End")){
            String product =  nextCommand;
            switch (product){
                case "Nuts":
                    if (nutsPrice > totalMoneyInserted){
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalMoneyInserted -= nutsPrice;
                        System.out.println("Purchased Nuts");
                    }
                    break;
                case "Water":
                    if (waterPrice > totalMoneyInserted){
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalMoneyInserted -= waterPrice;
                        System.out.println("Purchased Water");
                    }
                    break;
                case "Soda":
                    if (sodaPrice > totalMoneyInserted){
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalMoneyInserted -= sodaPrice;
                        System.out.println("Purchased Soda");
                    }
                    break;
                case "Crisps":
                    if (crispsPrice > totalMoneyInserted){
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalMoneyInserted -= nutsPrice;
                        System.out.println("Purchased Nuts");
                    }
                    break;
                case "Coke":
                    if (cokePrice > totalMoneyInserted){
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalMoneyInserted -= cokePrice;
                        System.out.println("Purchased Coke");
                    }
                    break;
            }

            nextCommand = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoneyInserted);
    }
}
