import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = " " + sc.nextLine() + " ";
        String b = " " + sc.nextLine() + " ";
        String answer = sc.nextLine();


        if (a.split(answer).length >= 2 && b.split(answer).length >= 2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
