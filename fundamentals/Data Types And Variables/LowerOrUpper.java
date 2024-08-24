import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String character = scanner.nextLine();
        char ch = character.charAt(0);

        if (Character.isUpperCase(ch)){
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
