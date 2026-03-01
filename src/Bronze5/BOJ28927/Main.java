package Bronze5.BOJ28927;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] max = new int[4];
        int[] mel = new int[4];
        String winner;

        for (int i = 0; i < 3; i++) {
            max[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            mel[i] = sc.nextInt();
        }

        max[3] = max[0]*3 + max[1]*20 + max[2]*120;
        mel[3] = mel[0]*3 + mel[1]*20 + mel[2]*120;

        if (max[3] > mel[3]) {
            winner = "Max";
        }
        else if (max[3] < mel[3]) {
            winner = "Mel";
        }
        else {
            winner = "Draw";
        }

        System.out.println(winner);
    }
}

