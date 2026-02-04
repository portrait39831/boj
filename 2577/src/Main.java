import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] frequency = new int[10];

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String[] result = String.valueOf(a * b * c).split("");

        for (String s : result) {
            frequency[Integer.parseInt(s)] += 1;
        }

        for (int i : frequency) {
            System.out.println(i);
        }
    }
}
