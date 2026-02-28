package Bronze5.BOJ3003;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] result = new int[6];
        int[] chess = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int temp = sc.nextInt();
            result[i] = chess[i] - temp;
        }
        System.out.printf("%d %d %d %d %d %d", result[0], result[1], result[2],
                result[3], result[4], result[5]);

    }
}

