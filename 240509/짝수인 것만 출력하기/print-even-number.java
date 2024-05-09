import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for(int i = 0 ; i < n ; i++){
            int x = sc.nextInt();

            if(x % 2 == 0){
                arr[count] = x;
                count ++;
            }
        }

        for(int i = 0 ; i < count; i ++){
            System.out.print(arr[i] + " ");
        }

        
    }
}