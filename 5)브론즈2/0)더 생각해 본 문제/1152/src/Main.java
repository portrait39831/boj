import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringTokenizer st = new StringTokenizer(sc.nextLine().strip()); //토크나이저가 편한 경우도 있구나

        System.out.println(st.countTokens());
    }
}
