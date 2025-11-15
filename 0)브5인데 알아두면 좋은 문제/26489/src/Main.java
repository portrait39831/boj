import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        while(sc.hasNext()) {
            String str = sc.nextLine();

            if (str.isEmpty()) {
                break;
            }
            else {
                result += 1;
            }
        }
        System.out.println(result);

    }
}

//hasNext는 공백을 무시하고 다음 데이터가 존재하는지 확인하는 메소드임(hasNext 자체에 공백 무시 기능 있음)
