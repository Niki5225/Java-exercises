import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class GaussTrick {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        List<Integer> list = new ArrayList<Integer>();

        for(int num : array){
            list.add(num);
        }

        while (!list.isEmpty()){
           int firstNum = list.remove(0);
           int secondNum = 0;
           if (!list.isEmpty()){
               secondNum = list.remove(list.size() - 1);
           }
           int result = firstNum + secondNum;
            System.out.print(result + " ");
        }
    }
}
