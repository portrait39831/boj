package Bronze5.BOJ24736;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] visit = new int[5];
        int[] home = new int[5];

        for (int i = 0; i < 5; i++) {
            visit[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            home[i] = sc.nextInt();
        }

        int total_visit = 6*visit[0] + 3*visit[1] + 2*visit[2] + visit[3] + 2*visit[4];
        int total_home = 6*home[0] + 3*home[1] + 2*home[2] + home[3] + 2*home[4];
        System.out.println(total_visit + " " + total_home);
    }
}


