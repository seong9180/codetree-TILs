import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        int avg = sum / 3; // 세 숫자의 합이 3의 배수라고 주어졌기 때문에 정수로 선언.

        System.out.println(sum);
        System.out.println(avg);
        System.out.println(sum - avg);

    }
}