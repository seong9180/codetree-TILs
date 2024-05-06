import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;
        double score = 0;

        for(int i = 0 ; i < n ; i ++){
            score = sc.nextDouble();
            sum += score;
        }

        double avg = sum / (double)n;

        System.out.printf("%.1f",avg);
        System.out.println();

        if(avg >= 4.0){
            System.out.println("Perfect");
        }else if(avg >= 3.0){
            System.out.println("Good");
        }else{
            System.out.println("Poor");
        }


    }
}