import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        String[] b = sc.nextLine().split("");

        System.out.println(a * Integer.parseInt(b[2]));
        System.out.println(a * Integer.parseInt(b[1]));
        System.out.println(a * Integer.parseInt(b[0]));
        System.out.println(a * (Integer.parseInt(b[0]) * 100 + Integer.parseInt(b[1]) * 10 + Integer.parseInt(b[2])));
    }
}
