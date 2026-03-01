package Bronze5.BOJ34691;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String q;
        String a;

        while(true) {
            q = sc.next();

            if (q.equals("animal")) {
                a = "Panthera tigris";
            }
            else if (q.equals("tree")) {
                a = "Pinus densiflora";
            }
            else if (q.equals("flower")) {
                a = "Forsythia koreana";
            }
            else {
                break;
            }

            System.out.println(a);
        }
    }
}
