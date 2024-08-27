import java.util.Scanner;

public class Grades {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        System.out.println(noteToGrade(grade));
    }

    public static String noteToGrade(double grade){
        if (grade < 3){
            return "Fail";
        } else if (grade < 3.5){
            return "Poor";
        } else if (grade < 4.5){
            return "Good";
        } else if (grade < 5.5){
            return "Very good";
        } else {
            return "Excellent";
        }
    }
}
