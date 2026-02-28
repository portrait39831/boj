package Bronze5.BOJ3733;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // has~~를 사용해 입력받는 값이 있는지 없는지 확인할 수 있음
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            System.out.println(s/(n+1));
        }
    }
}

