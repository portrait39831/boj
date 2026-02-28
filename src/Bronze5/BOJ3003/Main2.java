package Bronze5.BOJ3003;

import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] chess = new int[]{1,1,2,2,2,8};

        for(int i = 0; i < 6; i++){
            int c = sc.nextInt();

            if (i == 0 || i == 1){
                chess[i] = 1 - c;
            }

            else if (i == 2 || i == 3 || i == 4){
                chess[i] = 2 - c;
            }

            else{
                chess[i] = 8 - c;
            }
        }

        for(int i = 0; i < 6; i++){
            System.out.print(chess[i] + " ");
        }
    }
}
