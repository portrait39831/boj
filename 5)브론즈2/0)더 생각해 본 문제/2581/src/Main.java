import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int min = -1;
        int sum = 0;

        for (int i = m; i <= n; i++) {
            if (i == 1) continue;
            if (i % 2 == 0 && i != 2) continue;
            if (i % 3 == 0 && i != 3) continue;
            if (i % 5 == 0 && i != 5) continue;
            if (i % 7 == 0 && i != 7) continue;
            if (i % 11 == 0 && i != 11) continue;
            if (i % 13 == 0 && i != 13) continue;
            if (i % 17 == 0 && i != 17) continue;
            if (i % 19 == 0 && i != 19) continue;
            if (i % 23 == 0 && i != 23) continue;
            if (i % 29 == 0 && i != 29) continue;
            if (i % 31 == 0 && i != 31) continue;
            if (i % 37 == 0 && i != 37) continue;
            if (i % 41 == 0 && i != 41) continue;
            if (i % 43 == 0 && i != 43) continue;
            if (i % 47 == 0 && i != 47) continue;
            if (i % 53 == 0 && i != 53) continue;
            if (i % 59 == 0 && i != 59) continue;
            if (i % 61 == 0 && i != 61) continue;
            if (i % 67 == 0 && i != 67) continue;
            if (i % 71 == 0 && i != 71) continue;
            if (i % 73 == 0 && i != 73) continue;
            if (i % 79 == 0 && i != 79) continue;
            if (i % 83 == 0 && i != 83) continue;
            if (i % 89 == 0 && i != 89) continue;
            if (i % 97 == 0 && i != 97) continue;
            if (min == -1) min = i;
            sum += i;
        }

        if (min != -1) {
            System.out.println(sum);
        }
        System.out.println(min);

    }
}
