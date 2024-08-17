import java.util.Scanner;

public class Vacation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double discount = 0;
        double totalPrice = 0;



        if (typeOfGroup.equals("Business")){
            if (numberOfPeople >= 100){
                numberOfPeople -= 10;
            }
            totalPrice = switch (day) {
                case "Friday" -> 10.9 * numberOfPeople;
                case "Saturday" -> 15.6 * numberOfPeople;
                case "Sunday" -> 16 * numberOfPeople;
                default -> totalPrice;
            };
        } else if (typeOfGroup.equals("Students")){
            if (numberOfPeople >= 30){
                discount = 0.15;
            }
            totalPrice = switch (day) {
                case "Friday" -> 8.45 * numberOfPeople;
                case "Saturday" -> 9.8 * numberOfPeople;
                case "Sunday" -> 10.46 * numberOfPeople;
                default -> totalPrice;
            };

            totalPrice = totalPrice - totalPrice * discount;
        } else if (typeOfGroup.equals("Regular")){
            if (numberOfPeople >= 10 && numberOfPeople <= 20){
                discount = 0.05;
            }
            totalPrice = switch (day) {
                case "Friday" -> 15 * numberOfPeople;
                case "Saturday" -> 20 * numberOfPeople;
                case "Sunday" -> 22.5 * numberOfPeople;
                default -> totalPrice;
            };

            totalPrice = totalPrice - totalPrice * discount;
        }

        System.out.printf("Total price: %.2f", totalPrice);

    }
}
