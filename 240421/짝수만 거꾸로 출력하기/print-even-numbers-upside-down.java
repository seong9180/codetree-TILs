import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;

        int[] even_number = new int[100];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(n == 1){
                if(arr[i] % 2 == 0) {
                    System.out.println(arr[i]);
                }else {
                    System.out.println("0");
                }
            }else{
                if (arr[i] % 2 == 0) {
                    even_number[cnt] = arr[i]; //짝수만 별도의 배열에 저장
                    cnt ++; //짝수 배열의 인덱스 접근을 위함
                }
            }
        }
        for (int i = cnt -1 ; i >= 0; i--) {
            //cnt - 1 인 이유 : cnt++ 증가식이 마지막 짝수에도 증가되기 떄문에
            //실제 값이 들어간 배열의 인덱스를 부르기 위해서는 cnt - 1 을 해야 정확하다
            System.out.print(even_number[i] + " ");
        }
    }
}