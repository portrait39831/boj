import java.util.*;

//에라토스테네스의 체 idea
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();

            if (input == 1) continue;
            if (input % 2 == 0 && input != 2) continue;
            if (input % 3 == 0 && input != 3) continue;
            if (input % 5 == 0 && input != 5) continue;
            if (input % 7 == 0 && input != 7) continue;
            if (input % 11 == 0 && input != 11) continue;
            if (input % 13 == 0 && input != 13) continue;
            if (input % 17 == 0 && input != 17) continue;
            if (input % 19 == 0 && input != 19) continue;
            if (input % 23 == 0 && input != 23) continue;
            if (input % 29 == 0 && input != 29) continue;
            if (input % 31 == 0 && input != 31) continue;
            //37 * 37 > 1000이라서 할 필요 없음 무조건 하나는 37보다 작아야 함

            result += 1;
        }

        System.out.println(result);


    }
}
