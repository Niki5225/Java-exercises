import java.util.Scanner;

public class Login {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = new StringBuilder(username).reverse().toString();

        int attempts = 0;

        while (true){
            String attempt = scanner.nextLine();
            attempts++;

            if (attempt.equals(password)){
                System.out.printf("User %s logged in", username);
                return;
            } else {
                if (attempts == 4){
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }
        }
        System.out.printf("User %s blocked!", username);
    }
}
