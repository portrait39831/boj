import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //TODO : 10억은 10^9였음.... 10^5(10만) * 10^5(10만)는 100억이었음....

        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(a * a - b * b);
    }
}
