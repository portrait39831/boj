import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] min = new int[4];
        int[] man = new int[4];

        for (int i = 0; i < 4; i++) {
            min[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            man[i] = sc.nextInt();
        }

        int s = 0;
        int t = 0;

        for (int i = 0; i < 4; i++) {
            s += min[i];
            t += man[i];
        }

        System.out.println(Math.max(s,t));
    }
}
