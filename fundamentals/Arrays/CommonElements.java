import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        for(var element1 : array1){
            for (var element2 : array2){
                if (element1.equals(element2)){
                    System.out.print(element1 + " ");
                }
            }
        }
    }
}
