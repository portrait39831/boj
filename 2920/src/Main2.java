import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sound = sc.nextInt();
        String result;

        if (sound == 1) {
            result = "ascending";
        }
        else if (sound == 8){
            result = "descending";
        }
        else {
            result = "mixed";
        }

        for (int i = 0; i < 7; i++) {
            int beforeSound = sound;
            sound = sc.nextInt();

            if (Math.abs(sound - beforeSound) != 1) {
                result = "mixed";
            }
        }

        System.out.println(result);
    }
}
