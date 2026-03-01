package Bronze5.BOJ30214;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        double s2 = sc.nextDouble();

        if (s1 >= s2/2) {
            System.out.println("E");
        }
        else {
            System.out.println("H");
        }
    }
}

