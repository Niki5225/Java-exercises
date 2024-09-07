import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double totalSum = 0;
        double taxes = 0;
        String clientType = "";

        while (true){
            String command = scanner.nextLine();
            if (command.equals("special") || command.equals("regular")){
                clientType = command;
                break;
            }

            double price = Double.parseDouble(command);
            if (price < 0){
                System.out.println("Invalid price!");
                continue;
            }
            totalSum += price;
            taxes += 0.2 * price;
        }

        if (totalSum == 0){
            System.out.println("Invalid order!");
            return;
        }

        double totalSumWithTaxes = totalSum + taxes;

        if (clientType.equals("special")){
            totalSumWithTaxes = totalSumWithTaxes * 0.9;
        }

        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", totalSum);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", totalSumWithTaxes);
    }
}
