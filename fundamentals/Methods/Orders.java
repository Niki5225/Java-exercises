import java.util.Scanner;

public class Orders {
    public static void main(String[] args){
        double coffeePrice = 1.5;
        double waterPrice = 1;
        double cokePrice = 1.4;
        double snacksPrice = 2;

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "water":
                printOrder(waterPrice, amount);
                break;
            case "coke":
                printOrder(cokePrice, amount);
                break;
            case "coffee":
                printOrder(coffeePrice, amount);
                break;
            case "snacks":
                printOrder(snacksPrice, amount);
                break;
        }
    }

    public static void printOrder(double productPrice, int amount){
        System.out.printf("%.2f", productPrice * amount);
    }
}
