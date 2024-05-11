import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        for(int i = 0 ; i <10; i++){
            int x = sc.nextInt();

            if(x == 1){
                arr[0] ++;
            }else if(x == 2){
                arr[1] ++;
            }else if(x == 3){
                arr[2] ++;
            }else if(x == 4){
                arr[3] ++;
            }else if(x == 5){
                arr[4] ++;
            }else{
                arr[5] ++;
            }
        }

        for(int i = 1; i <= 6; i++){
            System.out.println(i + " - " + arr[i-1]);
        }
    }
}