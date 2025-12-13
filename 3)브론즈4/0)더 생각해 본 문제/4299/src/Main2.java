import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int sub = sc.nextInt();

        if ((sub + sum) % 2 == 0 && sum >= sub) {
            System.out.printf("%d %d", (sub + sum) / 2, (sum - sub) / 2);
        }
        else {
            System.out.println("-1");
        }
    }
}
