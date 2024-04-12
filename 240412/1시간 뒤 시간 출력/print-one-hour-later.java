import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //입력을 : 기준으로 분리
        sc.useDelimiter(":");
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        //입력받은 시간으로부터 1시간 뒤 시간 출력
        System.out.println((hour+1) + ":" + minute);
    }
}