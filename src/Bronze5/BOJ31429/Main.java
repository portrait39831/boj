package Bronze5.BOJ31429;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int solve = 0;
        int penalty = 0;

        switch (n) {
            case 1:
                solve = 12;
                penalty = 1600;
                break;
            case 2:
                solve = 11;
                penalty = 894;
                break;
            case 3:
                solve = 11;
                penalty = 1327;
                break;
            case 4:
                solve = 10;
                penalty = 1311;
                break;
            case 5:
                solve = 9;
                penalty = 1004;
                break;
            case 6:
                solve = 9;
                penalty = 1178;
                break;
            case 7:
                solve = 9;
                penalty = 1357;
                break;
            case 8:
                solve = 8;
                penalty = 837;
                break;
            case 9:
                solve = 7;
                penalty = 1055;
                break;
            case 10:
                solve = 6;
                penalty = 556;
                break;
            case 11:
                solve = 6;
                penalty = 773;
                break;
        }

        System.out.println(solve + " " + penalty);

    }
}

