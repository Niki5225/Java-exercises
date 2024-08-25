import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        String[] arr1 = new String[lines];
        String[] arr2 = new String[lines];

        for(int i = 1; i <= lines; i++){
            String[] input = scanner.nextLine().split(" ");
            String element1 = input[0];
            String element2 = input[1];

            if(i % 2 != 0){
                arr1[i - 1] = element1;
                arr2[i - 1] = element2;
            } else {
                arr2[i - 1] = element1;
                arr1[i - 1] = element2;
            }
        }

        System.out.println(String.join(" ", arr1));
        System.out.println(String.join(" ", arr2));
    }
}
