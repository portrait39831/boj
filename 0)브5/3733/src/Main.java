import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                int n = sc.nextInt();
                int s = sc.nextInt();

                System.out.println(s/(n+1));
            } catch (Exception e) {
                break;
            }

            //자바에서 EOF로 인해 발생하는 것은 NoSuchElement "Exception"이라서 예외 처리가 가능하다.
        }
    }
}
