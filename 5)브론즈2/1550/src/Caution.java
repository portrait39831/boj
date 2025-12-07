import java.util.*;

public class Caution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n = HexFormat.fromHexDigits(s); //HexFormat 클래스는 자바17에 추가

        System.out.println(n);
    }
}
