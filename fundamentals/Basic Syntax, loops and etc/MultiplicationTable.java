import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d", number, i, number * i);
            System.out.println();
        }
    }
}
