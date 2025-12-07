import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int h3 = sc.nextInt();
        int h4 = sc.nextInt();

        System.out.println((h1 + h2 + h3 + h4) / 60);
        System.out.println((h1 + h2 + h3 + h4) % 60);
    }
}
