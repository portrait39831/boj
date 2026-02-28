package Bronze5.BOJ3003;

import java.util.*;

public class Main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> chess = new ArrayList<>();
        ArrayList<Integer> new_chess = new ArrayList<>();

        for (int i = 0; i < 6; i++){
            int temp = sc.nextInt();
            chess.add(temp);
        }

//		System.out.println(chess);

        new_chess.add(0,1-chess.get(0));
        new_chess.add(1,1-chess.get(1));
        new_chess.add(2,2-chess.get(2));
        new_chess.add(3,2-chess.get(3));
        new_chess.add(4,2-chess.get(4));
        new_chess.add(5,8-chess.get(5));

        System.out.printf("%d %d %d %d %d %d", new_chess.get(0), new_chess.get(1), new_chess.get(2), new_chess.get(3), new_chess.get(4), new_chess.get(5));
    }
}
