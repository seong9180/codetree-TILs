import java.util.Scanner;
import java.lang.Math; //pow 연산 하기 위함

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        double min = Math.pow(2,31) - 1;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] <= min){
                min = arr[i];
            }
        }
        
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == min){
                count ++;
            }
        }

        System.out.println(min + " " + count);
    }
}