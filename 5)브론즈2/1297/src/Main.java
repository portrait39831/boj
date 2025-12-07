import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d = sc.nextDouble();
        int h = sc.nextInt();
        int w = sc.nextInt();

        double rate = Math.sqrt((d * d) / (h*h + w*w));

        System.out.printf("%d %d", (int)Math.floor(h * rate), (int)Math.floor(w * rate));
    }
}
