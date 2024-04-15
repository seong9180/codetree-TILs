import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            if(arr[i] %3 == 0 && arr[i] %2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}