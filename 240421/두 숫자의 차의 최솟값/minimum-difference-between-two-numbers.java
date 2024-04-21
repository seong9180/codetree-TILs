import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr= new int[n];
        int min = 100;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); //숫자들 배열에 입력
            if(i > 0){
                if((arr[i] - arr[i-1]) < min){
                    min = arr[i] - arr[i-1];
                }
            }
        }

        System.out.println(min);
    }
}