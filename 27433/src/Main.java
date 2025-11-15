import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long result = 1;

        for (int i = 0; i < n; i++) {
            result *= i+1;
        }

        //놀랍게도 20!은 long안에 들어감. 간단한 문제라서 BigInteger이나 재귀 쓰는 것보다 훨씬 보기 편함.
        System.out.println(result);
    }
}