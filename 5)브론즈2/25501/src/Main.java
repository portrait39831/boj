import java.util.*;

public class Main {
    static int calltime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String tmp = sc.nextLine(); //개행문자 빼기

        for (int i = 0; i < t; i++) {
            calltime = 0;
            String str = sc.nextLine();
            System.out.printf("%d %d\n",isPalindrome(str),calltime);
        }
    }

    public static int recursion (String str, int s, int l){
        if (s >= l) {
            return 1;
        }
        else if (str.charAt(s) != str.charAt(l)) {
            return 0;
        }
        else {
            calltime += 1;
            return recursion (str, s + 1, l - 1);
        }
    }

    public static int isPalindrome(String str) {
        calltime += 1;
        return recursion(str, 0, str.length()-1);
    }
}