import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        while(true){
            int max = 0;
            int idx = 1000;
            for(int i = 0 ; i<n; i++){
                if(arr[i] >= max){
                    max = arr[i];
                }
            }
            for(int i = 0 ; i<n; i++){
                if(arr[i] == max && i <= idx){
                    idx = i;
                }
            }
            int index = idx + 1; //idx = 1 이라면 (2번째 원소기 때문.)
            System.out.print(index + " ");

            if(idx == 0){ //첫 번째 원소
                break;
            }else{
                n = idx;
            }
        }
        
    }
}