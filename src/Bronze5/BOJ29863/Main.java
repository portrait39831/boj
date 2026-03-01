package Bronze5.BOJ29863;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sleep = sc.nextInt();
        int wake = sc.nextInt();

        if (sleep >= 20) {
            System.out.println(24 - sleep + wake);
        }
        else {
            System.out.println(wake - sleep);
        }
    }
}

