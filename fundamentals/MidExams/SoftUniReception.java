import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int employee1Capacity = Integer.parseInt(scanner.nextLine());
        int employee2Capacity = Integer.parseInt(scanner.nextLine());
        int employee3Capacity = Integer.parseInt(scanner.nextLine());

        int studentsCount = Integer.parseInt(scanner.nextLine());

        int questionsAnsweredPerHour = employee1Capacity + employee2Capacity + employee3Capacity;
        int hoursNeeded = 0;

        while (studentsCount > 0){
            hoursNeeded++;
            if(hoursNeeded % 4 == 0){
                continue;
            }

            studentsCount -= questionsAnsweredPerHour;
        }

        System.out.printf("Time needed: %dh.", hoursNeeded);

    }
}
