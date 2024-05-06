import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0;
        int count = 0;

        int[] score = new int[10];

        for(int i = 0; i < 10; i++){
            score[i] = sc.nextInt();
            
            if(score[i] == 0){
                count = i;
                break;
            }

            sum += score[i];
            count ++;
        }

        avg = (double)sum/(double)count;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
    }
}