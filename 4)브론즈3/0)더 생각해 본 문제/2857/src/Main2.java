import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String agent = "";

        for (int i = 0; i < 5; i++) {
            agent = sc.nextLine();

            if (agent.length() < 3) {
                continue; //인덱스 벗어나는 거 방지 (3글자 미만은 무조건 false니까 패스)
            }

            //중간에 FBI 있을 때
            if (agent.split("FBI").length > 1) {
                sb.append(i + 1).append(" ");
            }

            //맨뒤에 FBI 있을 때
            else if (agent.charAt(agent.length()-3) == 'F' && agent.charAt(agent.length()-2) == 'B' && agent.charAt(agent.length()-1) == 'I') {
                sb.append(i + 1).append(" ");
            }

            //맨앞에 FBI 있을 때
            else if (agent.charAt(0) == 'F' && agent.charAt(1) == 'B' && agent.charAt(2) == 'I') {
                sb.append(i + 1).append(" ");
            }
        }

        if (String.valueOf(sb).isEmpty()) {
            System.out.println("HE GOT AWAY!");
        }
        else {
            System.out.println(sb);
        }
    }
}
