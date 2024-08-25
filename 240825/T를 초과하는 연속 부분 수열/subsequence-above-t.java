import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < n ; i++){
            if(arr[i] > t){
                count ++;
                if(count >= maxCount){
                    maxCount = count;
                }
            }else{
                count = 0;
            }
        }
        
        if(maxCount == 0){
            System.out.println(0);
        }else{
            System.out.println(maxCount);
        }
        
    }
}