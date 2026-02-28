package Bronze5.BOJ15727;

import java.util.*;

//거리 = 시간 * 속력, 최대 속력이 5이므로 거리가 5의 배수라면 깔끔하게 떨어지고 아니라면 1분 더 가야함

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();

        System.out.println(l % 5 == 0
                ?l / 5
                :l / 5 + 1);
    }
}
