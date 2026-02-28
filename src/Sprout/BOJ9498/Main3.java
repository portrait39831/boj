package Sprout.BOJ9498;

import java.util.*;

public class Main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        char grade; //선언을 if문 밖에서 하면 if문 밖에서도 쓸 수 있는 변수가 되는구나

        if(score >= 90){
            grade = 'A';
        }

        else if(score >= 80){
            grade = 'B';
        }

        else if(score >= 70){
            grade = 'C';
        }

        else if(score >= 60){
            grade = 'D';
        }

        else{
            grade = 'F';
        }

        System.out.println(grade);
    }
}
