import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for(int i = 0; i < 100; i++){
            int x = sc.nextInt();

            if(x == 0) break;

            if(x / 10 == 1){
                arr[0] ++;
            }else if(x / 10 == 2){
                arr[1] ++;
            }else if(x / 10 == 3){
                arr[2] ++;
            }else if(x / 10 == 4){
                arr[3] ++;
            }else if(x / 10 == 5){
                arr[4] ++;
            }else if(x / 10 == 6){
                arr[5] ++;
            }else if(x / 10 == 7){
                arr[6] ++;
            }else if(x / 10 == 8){
                arr[7] ++;
            }else if(x / 10 == 9){
                arr[8] ++;
            }
        }

        for(int i = 0; i < 9; i++){
            System.out.println(i+1 + " - " + arr[i]);
        }
    }
}