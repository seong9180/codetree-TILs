import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0 ; i < n; i ++){
            int x = sc.nextInt();
            sum += x;
        }

        double avg = (double)sum / (double)n;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
        
    }
}