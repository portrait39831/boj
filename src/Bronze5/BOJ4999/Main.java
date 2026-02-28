package Bronze5.BOJ4999;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patient = sc.nextLine();
        String doctor = sc.nextLine();

        System.out.println(patient.length() >= doctor.length()
                ? "go"
                : "no" );
    }
}

