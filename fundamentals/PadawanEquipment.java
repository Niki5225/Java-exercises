import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextDouble();
        int students = scanner.nextInt();
        double lightsabersPrice = scanner.nextDouble();
        double robesPrice = scanner.nextDouble();
        double beltsPrice = scanner.nextDouble();

        int amountOfLightsabers = (int)Math.ceil(students + students * 0.1);
        int amountOfRobes = students;
        int amountOfBelts = students - (students / 6);

        double totalMoneyNeeded = lightsabersPrice * amountOfLightsabers +
                robesPrice * amountOfRobes +
                beltsPrice * amountOfBelts;

        if (money >= totalMoneyNeeded){
            System.out.printf("The money is enough - it would cost %.2flv", totalMoneyNeeded);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more", totalMoneyNeeded - money);
        }

    }
}
