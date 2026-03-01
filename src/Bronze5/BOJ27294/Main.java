package Bronze5.BOJ27294;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int s = sc.nextInt();

        int grain = 280;
        if (t >= 12 && t <= 16 && s == 0) {
            grain = 320;
        }

        System.out.println(grain);
    }
}

