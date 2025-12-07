import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float w = sc.nextFloat();
        float h = sc.nextFloat();

        System.out.println(w * h / 2);
        //슬라이싱하고 그럴 필요 없이 지가 알아서 소수점 아래 첫째 자리까지만 뽑아서 줌
        //정수 나누기 정수라서 소수점은 .0 아니면 .5 밖에 안 나옴 무조건
    }
}
