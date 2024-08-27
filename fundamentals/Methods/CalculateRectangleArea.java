import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println(getAreaOfRectangle(width, length));
    }

    public static int getAreaOfRectangle(int width, int length){
        return width * length;
    }
}
