package Bronze5.BOJ28235;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String result;

        if (s.equals("SONGDO")) {
            result = "HIGHSCHOOL";
        }
        else if (s.equals("CODE")) {
            result = "MASTER";
        }
        else if (s.equals("2023")) {
            result = "0611";
        }
        else {
            result = "CONTEST";
        }

        System.out.println(result);
    }
}

