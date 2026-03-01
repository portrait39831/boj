package Sprout.BOJ27866;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int i = sc.nextInt();

        s = s.substring(i-1,i);

        System.out.println(s);

    }
}
