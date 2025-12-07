import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String agent = "";

        for (int i = 0; i < 5; i++) {
            agent = sc.nextLine();

            if (agent.contains("FBI")) {
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
