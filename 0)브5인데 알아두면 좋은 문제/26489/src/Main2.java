import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int result = 0;

        try {
            while (true) {
                String str = sc.nextLine();

                if (str.isEmpty()) {
                    break;
                }
                else {
                    result += 1;
                }
            }
            System.out.println(result);
        } catch (NoSuchElementException e) {
            System.out.println(result);
        }

    }
}

//EOFException은 java.io에서 발생, NoSuchElementException은 java.util에서 발생
