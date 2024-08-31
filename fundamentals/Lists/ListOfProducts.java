import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class ListOfProducts {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfProducts = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<String>();

        for(int i = 0; i < numberOfProducts; i++){
            String product = scanner.nextLine();
            products.add(product);
        }

        Collections.sort(products);

        for(int i = 0; i < products.size(); i++){
            System.out.printf("%d.%s", i + 1, products.get(i));
            System.out.println();
        }
    }
}
