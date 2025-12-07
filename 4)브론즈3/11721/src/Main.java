import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split("");

        int enter = 0;

        for (String s : arr) {
            System.out.print(s);
            enter += 1;

            if (enter == 10) {
                enter = 0;
                System.out.println();
            }
        }
    }
}
