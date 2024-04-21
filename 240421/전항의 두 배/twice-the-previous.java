import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //수열의 첫 항과 두번째 항 저장
        int value_1 = sc.nextInt();
        int value_2 = sc.nextInt();

        int[] arr = new int[10];
        arr[0] = value_1;
        arr[1] = value_2;

        for(int i = 0; i < 10; i ++){
            if(i > 1){ //세 번째 항부터 공식에 사용
                arr[i] = arr[i-1] + 2 * arr[i-2];
            }
            System.out.print(arr[i] + " ");
        }
    }
}