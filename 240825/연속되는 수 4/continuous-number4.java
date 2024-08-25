import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0  ; i< n ; i++){
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int maxCount = 1;

        for(int i = 0 ; i< n ; i++){
            if(i != 0 && arr[i-1] < arr[i]){
                count ++;
                if(count >= maxCount){
                    maxCount = count;
                }
            }else{
                count = 1;
            }
        }

        System.out.println(maxCount);
    }
}