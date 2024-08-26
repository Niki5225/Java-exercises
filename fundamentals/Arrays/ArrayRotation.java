import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        int rotations = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < rotations; i++){
            String[] rotatedArray = new String[array.length];

            for (int j = 1; j < array.length ; j++){
                rotatedArray[j - 1] = array[j];
            }
            rotatedArray[rotatedArray.length - 1] = array[0];

            array = rotatedArray;
        }

        System.out.println(String.join(" ", array));
    }
}
