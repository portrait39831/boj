import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] score = new double[n];
        double m = 0;

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt(); //처음 점수는 정수
            if (m < score[i]) {
                m = score[i];
            }
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            score[i] = score[i] / m * 100;
            sum += score[i];
        }

        System.out.println(sum/n);

    }
}
