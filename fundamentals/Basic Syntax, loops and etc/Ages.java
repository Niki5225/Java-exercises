import java.util.Scanner;

public class Ages {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age >= 0 && age <= 2){
            System.out.println("baby");
        } else if (age <= 13){
            System.out.println("child");
        } else if (age <= 19){
            System.out.println("teenager");
        } else if (age <= 65){
            System.out.println("adult");
        } else if (age > 66){
            System.out.println("elder");
        } else {
            System.out.println("Error! Age can't be lower than 0!");
        }
    }
}
