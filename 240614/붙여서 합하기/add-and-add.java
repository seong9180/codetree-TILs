import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Integer.parseInt() 함수로 문자열을 감싸주면 문자열을 정수로 변환할 수 있습니다.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String new_ab = a + b;
        String new_ba = b + a;

        int sum = Integer.parseInt(new_ab) + Integer.parseInt(new_ba);
        System.out.println(sum);
    }
}