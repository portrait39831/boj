package Bronze5.BOJ30676;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String color;
        if (n >= 620) {
            color = "Red";
        }
        else if (n >= 590) {
            color = "Orange";
        }
        else if (n >= 570) {
            color = "Yellow";
        }
        else if (n >= 495) {
            color = "Green";
        }
        else if (n >= 450) {
            color = "Blue";
        }
        else if (n >= 425) {
            color = "Indigo";
        }
        else {
            color = "Violet";
        }

        System.out.println(color);
    }
}

