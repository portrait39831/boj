package Bronze5.BOJ23235;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 1;

        while(sc.hasNext()) {
            String str = sc.nextLine();
            if (str.equals("0")) {
                break;
            }
            System.out.printf("Case %d: Sorting... done!\n",n);
            n += 1;
        }
    }
}

