import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] b1 = sc.nextLine().split("");
        String[] b2 = sc.nextLine().split("");

        StringBuilder result = new StringBuilder();
        int factor = 1;
        int intB1 = 0;
        int intB2 = 0;

        for (int i = b1.length; i > 0; i--) {
            intB1 += Integer.parseInt(b1[i - 1]) * factor;
            factor *= 2;
        }

        factor = 1;

        for (int i = b2.length; i > 0; i--) {
            intB2 += Integer.parseInt(b2[i - 1]) * factor;
            factor *= 2;
        }

        long multiply = (long)intB1 * intB2;

        while (true) {
            result.append(multiply % 2);
            multiply /= 2;

            if (multiply == 0) {
                break;
            }
        }

        System.out.println(result.reverse());
    }
}
