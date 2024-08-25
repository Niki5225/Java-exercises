import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int day = Integer.parseInt(scanner.nextLine());

        switch (day - 1){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(arr[day - 1]);
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
