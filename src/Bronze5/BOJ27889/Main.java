package Bronze5.BOJ27889;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String abbreviation = sc.next();
        String realname;

        if (abbreviation.equals("NLCS")) {
            realname = "North London Collegiate School";
        }
        else if (abbreviation.equals("BHA")) {
            realname = "Branksome Hall Asia";
        }
        else if (abbreviation.equals("KIS")) {
            realname = "Korea International School";
        }
        else {
            realname = "St. Johnsbury Academy";
        }

        System.out.println(realname);
    }
}

