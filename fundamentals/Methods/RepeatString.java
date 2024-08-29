import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatedString(count, string));
    }

    public static String repeatedString(int times, String str){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < times; i++) {
            result.append(str);
        }

        return result.toString();
    }
}
