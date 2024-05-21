import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;

        for(int i = 1; i <= 10; i++){
            int x = sc.nextInt();
            if(x >=0 && x <= 200){
                sum += x;
                count ++;
            }
        }

        double avg = (double)sum / (double)count;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
    }
}