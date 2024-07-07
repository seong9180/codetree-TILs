import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //정수 n
        int targetNum = sc.nextInt(); //목표 진수

        int[] digits = new int[100];
        int cnt = 0;

        while(true){
            if(n < targetNum){
                digits[cnt++] = n;
                break;
            }

            digits[cnt++] = n % targetNum;
            n /= targetNum;
        }

        for(int i = cnt - 1; i >= 0; i--){
            System.out.print(digits[i]);
        }
    }
}