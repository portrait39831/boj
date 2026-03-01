package Bronze5.BOJ34217;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a+c < b+d) {
            System.out.println("Hanyang Univ.");
        }
        else if (a+c > b+d) {
            System.out.println("Yongdap");
        }
        else {
            System.out.println("Either");
        }
    }
}

