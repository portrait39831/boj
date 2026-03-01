package Bronze5.BOJ27433;

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long result = 1;

        for (int i = 0; i < n; i++) {
            result *= i+1;
        }

        //놀랍게도 20!은 long 범위 안에 들어감
        System.out.println(result);
    }
}
