package Bronze5.BOJ15000;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        //전부 대문자로 바꾸는 문제니까 일일이 바꿀 필요가 없는데 왜 그렇게 했을까 어쩐지 시간이 오래 걸리더라
        System.out.println(str.toUpperCase());

    }
}

