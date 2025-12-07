import java.util.*;

public class Main2 {
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

                stack.addAll(Arrays.asList(code));

                int n = code.length;

                for (int i = 0; i < n; i++) {
                    System.out.print(stack.pop());
                }
                System.out.println();
            }
        }
    }
}