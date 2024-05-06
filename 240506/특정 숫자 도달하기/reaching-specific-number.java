import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < 10 ; i++){
            if(arr[i] >= 250){
                break;
            }else{
                sum += arr[i];
                count ++;
            }
        }

        double avg = (double)sum/(double)count;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
        
    }
}