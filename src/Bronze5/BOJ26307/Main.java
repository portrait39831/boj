package Bronze5.BOJ26307;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hh = sc.nextInt();
        int mm = sc.nextInt();

        System.out.println((hh-9)*60+mm);
    }
}

