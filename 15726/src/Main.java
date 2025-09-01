import java.util.*;

/* a/b*c이랑 a*b/c 단순 비교했을 때 반례 : 10 3 6
    10/3이 3.33333인데 정수/정수라서 몫만 출력됨 그래서 20이 아니라 18이 나와서 틀림

    a * (b/c) 혹은 a * (c/b)로 생각하여 b와 c의 대소 관계만을 생각하면 되는 문제였음 !!
    아니면 b랑 c를 double 형으로 선언해서 소수점이 나오도록 하던가
*/

//float는 소수점 이하 6 ~ 7자리의 정확도를 가지지만 문제에서 더 높은 정확도를 요구하므로 double 필수

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        int result;

        if (b > c) {
            result = (int)(a * b / c);
        }
        else {
            result = (int)(a / b * c);
        }

        System.out.printf("%d",result);
    }
}