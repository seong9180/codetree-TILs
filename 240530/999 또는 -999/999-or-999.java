import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int max = -999, min = 999;

        for(int i = 0 ; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 999 || arr[i] == -999){
                break;
            }else{
                if(arr[i] >= max){
                    max = arr[i];
                }
                if(arr[i] <= min){
                    min = arr[i];
                    //System.out.println("min = " + min);
                }
            }
        }

        System.out.println(max + " " + min);
    }
}