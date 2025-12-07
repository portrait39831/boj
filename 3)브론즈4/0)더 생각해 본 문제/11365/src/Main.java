import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();


        while(sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals("END")) {
                break;
            }
            else {
                String[] code = s.split("");

                for (String item : code) {
                    stack.push(item);
                    /*
                    push는 stack 자체에 있는 메소드로 추가한 객체를 반환
                    add는 Arrays에 있는 메소드로 객체 추가 성공 여부를 반환
                    (웬만하면 push 쓰랜다)
                     */
                }

                int n = code.length;

                for (int i = 0; i < n; i++) {
                    System.out.print(stack.pop());
                }
                System.out.println();
            }
        }
    }
}