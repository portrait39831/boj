package Sprout.BOJ9086;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            System.out.printf("%s%s\n",str.charAt(0),str.charAt(str.length()-1));
        }
    }
}
