import java.util.Scanner;

public class Train {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        String[] people = new String[wagons];

        int sum = 0;
        for(int i = 0; i < wagons; i++){
            String currentPeopleInWagon = scanner.nextLine();

            people[i] = currentPeopleInWagon;
            sum += Integer.parseInt(currentPeopleInWagon);
        }

        System.out.println(String.join(" ", people));
        System.out.println(sum);
    }
}
