import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        double score = 0;

        for(int i = 0 ; i < 8; i++){
            score = sc.nextDouble();
            sum += score;
        }

        double avg = sum / 8.0;

        System.out.printf("%.1f", avg);

    }
}