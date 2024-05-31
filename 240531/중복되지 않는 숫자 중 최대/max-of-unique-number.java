import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] max_n = new int[1001]; //인덱스와 값을 매칭하기 위해 1001범위로 설정
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt(); //1 2 1 
            max_n[arr[i]] ++; //max_n[1] = 2 , max_n[2] = 1 > {0,2,1,0,0,0....}
        }

        int max = 0;
        boolean exist = false;
        for(int i = 0 ; i < 1001; i++){
            if(max_n[i] == 1){
                exist = true;
                if(i >= max){
                    max = i;
                }
            }
        }
        
        if(exist){
            System.out.println(max);
        }else{
            System.out.println(-1);
        }
        
    }
}