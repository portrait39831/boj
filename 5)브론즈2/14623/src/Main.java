import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b1 = Integer.parseInt(sc.nextLine(), 2);
        int b2 = Integer.parseInt(sc.nextLine(), 2);

        System.out.println(Long.toBinaryString((long)b1 * b2));
    }
}
