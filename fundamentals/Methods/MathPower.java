import java.util.Scanner;

public class MathPower {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        System.out.println(Math.pow(number, power));
    }
}
