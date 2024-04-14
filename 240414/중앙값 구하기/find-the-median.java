import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        */

        int max = -100;
        int min = 100;
        int mid = -100;

        int[] arr = new int[3];

        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
            //System.out.println(arr[i]);

            if(arr[i] > max){
                max = arr[i];
            }
        
            if(arr[i] < min){
                min = arr[i];
            }
            
        }
        
        for(int i = 0; i < 3; i++){
            if(arr[i] > min){
                if(arr[i] < max){
                    System.out.println(arr[i]);
                }
            }
        }

       
        
    }
}