package Bronze5.BOJ29699;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String c = "";

        switch (n % 14){
            case 1:
                c = "W";
                break;
            case 2:
                c = "e";
                break;
            case 3:
                c = "l";
                break;
            case 4:
                c = "c";
                break;
            case 5:
                c = "o";
                break;
            case 6:
                c = "m";
                break;
            case 7:
                c = "e";
                break;
            case 8:
                c = "T";
                break;
            case 9:
                c = "o";
                break;
            case 10:
                c = "S";
                break;
            case 11:
                c = "M";
                break;
            case 12:
                c = "U";
                break;
            case 13:
                c = "P";
                break;
            case 0:
                c = "C";
                break;
        }

        System.out.println(c);
    }
}

