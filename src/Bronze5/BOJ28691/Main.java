package Bronze5.BOJ28691;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String initial = sc.next();
        String result;

        if (initial.equals("M")) {
            result = "MatKor";
        }
        else if (initial.equals("W")) {
            result = "WiCys";
        }
        else if (initial.equals("C")) {
            result = "CyKor";
        }
        else if (initial.equals("A")) {
            result = "AlKor";
        }
        else {
            result = "$clear";
        }

        System.out.println(result);
    }
}

