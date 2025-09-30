import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //자바에는 nextChar() 같은 것은 없음
        char c = sc.next().charAt(0);
        System.out.println((int)c);
    }
}
