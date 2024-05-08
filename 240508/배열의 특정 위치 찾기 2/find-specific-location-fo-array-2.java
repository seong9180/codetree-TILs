import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int even_sum = 0;
        int odd_sum = 0;

        for(int i = 0 ; i < 10 ; i++){
            arr[i] = sc.nextInt();

            if((i+1) % 2 == 0){
                even_sum += arr[i];
            }else{
                odd_sum += arr[i];
            }
        }

        if(even_sum >= odd_sum){
            System.out.println(even_sum - odd_sum);
        }else{
            System.out.println(odd_sum - even_sum);
        }
        
    }
}