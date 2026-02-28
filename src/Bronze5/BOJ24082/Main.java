package Bronze5.BOJ24082;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        //최대 10의 9승이니까 10억, int 범위를 안 벗어난다.
        System.out.println(x*x*x);
    }
}

