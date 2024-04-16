import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();


            if(arr[i] % 3 == 0){
                cnt += 1;
                continue;
            }
            else{
                System.out.println("0");
                break;
            }
        }

        if(cnt == 5){
            System.out.println("1");
        }
    }
}