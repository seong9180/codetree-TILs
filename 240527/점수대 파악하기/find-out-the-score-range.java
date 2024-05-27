import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score_by_ten = new int[10];

        for(int i = 0; i < 100; i++){
            int score = sc.nextInt();
            if(score == 0){
                break;
            }

            if(score / 10 == 1){
                score_by_ten[0] ++;
            }else if(score / 10 == 2){
                score_by_ten[1] ++;
            }else if(score / 10 == 3){
                score_by_ten[2] ++;
            }else if(score / 10 == 4){
                score_by_ten[3] ++;
            }else if(score / 10 == 5){
                score_by_ten[4] ++;
            }else if(score / 10 == 6){
                score_by_ten[5] ++;
            }else if(score / 10 == 7){
                score_by_ten[6] ++;
            }else if(score / 10 == 8){
                score_by_ten[7] ++;
            }else if(score / 10 == 9){
                score_by_ten[8] ++;
            }else if(score / 10 == 10){
                score_by_ten[9] ++;
            }
        }

        for(int i = 100; i > 0; i -= 10){
            System.out.println(i + " - " + score_by_ten[i/10 - 1]);
        }
    }
}