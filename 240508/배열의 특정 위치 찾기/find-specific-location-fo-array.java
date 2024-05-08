import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum_one = 0;
        int sum_two = 0;
        int count = 0;

        for(int i = 1; i <= 10; i ++){
            arr[i-1] = sc.nextInt();

            if(i % 2 == 0){
                sum_one += arr[i-1];
            }

            if(i % 3 == 0){
                sum_two += arr[i-1];
                count ++;
            }
        }

        double avg = (double)sum_two / (double)count;

        System.out.print(sum_one + " ");
        System.out.printf("%.1f", avg);
    }
}