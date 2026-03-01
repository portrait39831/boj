package Bronze5.BOJ30087;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] room = new String[n];

        for (int i = 0; i < n; i++) {
            String seminar = sc.nextLine();

            if (seminar.equals("Algorithm")) {
                room[i] = "204";
            }
            else if (seminar.equals("DataAnalysis")) {
                room[i] = "207";
            }
            else if (seminar.equals("ArtificialIntelligence")) {
                room[i] = "302";
            }
            else if (seminar.equals("CyberSecurity")) {
                room[i] = "B101";
            }
            else if (seminar.equals("Network")) {
                room[i] = "303";
            }
            else if (seminar.equals("Startup")) {
                room[i] = "501";
            }
            else {
                room[i] = "105";
            }
        }

        for (String s : room) {
            System.out.println(s);
        }
    }
}

