import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String townName = scanner.nextLine();
        int population = scanner.nextInt();
        int area = scanner.nextInt();

        System.out.printf("Town %s has population of %d and area %d square km.", townName, population, area);
    }
}
