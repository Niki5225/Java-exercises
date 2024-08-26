import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");

        int[] integers = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            integers[i] = Integer.parseInt(elements[i]);
        }

        for (int i = 0; i < integers.length; i++) {
            int currentInt = integers[i];
            boolean isBigger = true;
            for(int j = i + 1; j < integers.length; j++){
                if (currentInt <= integers[j]){
                    isBigger = false;
                    break;
                }
            }
            if (isBigger){
                System.out.print(currentInt + " ");
            }
        }
    }
}
