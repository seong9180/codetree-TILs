import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] count = new int[9];

        if(n < 10){
            int[] arr = new int[10];
            for(int i = 0 ; i < 10; i++){
                if(i < n){
                    arr[i] = sc.nextInt();
                }

                if(arr[i] == 1){
                    count[0]++;
                }else if(arr[i] == 2){
                    count[1]++;
                }else if(arr[i] == 3){
                    count[2]++;
                }else if(arr[i] == 4){
                    count[3]++;
                }else if(arr[i] == 5){
                    count[4]++;
                }else if(arr[i] == 6){
                    count[5]++;
                }else if(arr[i] == 7){
                    count[6]++;
                }else if(arr[i] == 8){
                    count[7]++;
                }else if(arr[i] == 9){
                    count[8]++;
                }
            }
        }else{
            int[] arr = new int[n];
            for(int i = 0 ; i < n; i++){
                arr[i] = sc.nextInt();

                if(arr[i] == 1){
                    count[0]++;
                }else if(arr[i] == 2){
                    count[1]++;
                }else if(arr[i] == 3){
                    count[2]++;
                }else if(arr[i] == 4){
                    count[3]++;
                }else if(arr[i] == 5){
                    count[4]++;
                }else if(arr[i] == 6){
                    count[5]++;
                }else if(arr[i] == 7){
                    count[6]++;
                }else if(arr[i] == 8){
                    count[7]++;
                }else if(arr[i] == 9){
                    count[8]++;
                }
            }
        }
        
        for(int i = 0 ; i < 9; i++){
            System.out.println(count[i]);
        }
    }
}