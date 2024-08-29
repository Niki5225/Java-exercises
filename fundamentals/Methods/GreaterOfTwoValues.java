import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine().toLowerCase();
        String element1 = scanner.nextLine();
        String element2 = scanner.nextLine();

        System.out.println(getMax(type, element1, element2));
    }

    public static String getMax(String type, String el1, String el2){
        String result;
        switch (type){
            case "int":
                int num1 = Integer.parseInt(el1);
                int num2 = Integer.parseInt(el2);
                if (num1 > num2){
                    result = el1;
                } else {
                    result = el2;
                }
                break;
            case "char":
                int val1 = el1.charAt(0);
                int val2 = el2.charAt(0);
                if(val1 > val2) {
                    result = el1;
                } else {
                    result = el2;
                }
                break;
            case "string":
                if (el1.compareTo(el2) >= 0){
                    result = el1;
                } else {
                    result = el2;
                }
                break;
            default:
                result = "Error!";
        }

        return result;
    }
}
