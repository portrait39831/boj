import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            char[] s = sc.next().toCharArray();

            for (char c : s) {
                System.out.print((c + "").repeat(r));
            }
            System.out.println();
        }
    }
}
