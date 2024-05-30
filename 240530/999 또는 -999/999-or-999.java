import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[1000];
        int max = arr[0], min = arr[0];

        for(int i = 0 ; i < 1000; i++){
            int x = sc.nextInt();
            if(x == 999 || x == -999){
                break;
            }else{
                if(x >= max){
                    max = x;
                }
                if(x <= min){
                    min = x;
                }
            }
        }

        System.out.println(max + " " + min);
    }
}