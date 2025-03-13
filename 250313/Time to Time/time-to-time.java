import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        //각 시간을 분 단위로 환산
        int targetTime = c*60 + d;
        int startTime = a*60 + b;

        int result = targetTime - startTime;
        System.out.println(result);
    }
}