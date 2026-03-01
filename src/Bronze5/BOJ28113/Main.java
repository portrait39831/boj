package Bronze5.BOJ28113;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("Bus");
        }
        else if (a == b) {
            System.out.println("Anything");
        }
        else {
            System.out.println("Subway");
        }
    }
}
