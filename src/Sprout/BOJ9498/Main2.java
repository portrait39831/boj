package Sprout.BOJ9498;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90) {
            score = 65;
        }
        else if (score >= 80) {
            score = 66;
        }
        else if (score >= 70) {
            score = 67;
        }
        else if (score >= 60) {
            score = 68;
        }
        else {
            score = 70;
        }

        System.out.println((char)score);
    }
}
