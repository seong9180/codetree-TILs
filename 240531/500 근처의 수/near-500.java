import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0 ; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        int max_under500 = 0;
        int min_over500 = 1000;

        for(int i = 0 ; i < 10; i++){
            if(arr[i] < 500 && arr[i] >= max_under500){
                max_under500 = arr[i];
            }else if(arr[i] >= 500 && arr[i] <= min_over500){
                min_over500 = arr[i];
            }
        }

        System.out.println(max_under500 + " " + min_over500); 
    }
}