import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int sum = 0;

        for(int i = 0 ; i < 100; i ++){
            arr[i] = sc.nextInt();

            if(arr[i] == 0){
                sum = arr[i-1] + arr[i-2] + arr[i-3];
                break;
            }
        }

        System.out.println(sum);
    }
}