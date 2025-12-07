import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String grade = sc.next();

        switch (grade) {
            case "A+":
                grade = "4.3";
                break;
            case "A0":
                grade = "4.0";
                break;
            case "A-":
                grade = "3.7";
                break;
            case "B+":
                grade = "3.3";
                break;
            case "B0":
                grade = "3.0";
                break;
            case "B-":
                grade = "2.7";
                break;
            case "C+":
                grade = "2.3";
                break;
            case "C0":
                grade = "2.0";
                break;
            case "C-":
                grade = "1.7";
                break;
            case "D+":
                grade = "1.3";
                break;
            case "D0":
                grade = "1.0";
                break;
            case "D-":
                grade = "0.7";
                break;
            case "F":
                grade = "0.0";
                break;
        }

        System.out.println(grade);
    }
}