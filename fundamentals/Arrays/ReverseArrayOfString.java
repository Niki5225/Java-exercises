import java.util.Scanner;

public class ReverseArrayOfString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        for(int i = 0; i < arr.length / 2; i++){
            int otherIndex = arr.length - 1 - i;
            String element1 = arr[i];
            String element2 = arr[otherIndex];

            arr[i] = element2;
            arr[otherIndex] = element1;
        }

        System.out.println(String.join(" ", arr));
    }
}
