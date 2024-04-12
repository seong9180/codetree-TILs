import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("\\-"); //"." 이 아닌 다른 표현에도 \\사용 시 어떻게 출력되는 지 확인

        int region_number = sc.nextInt();
        int front_number = sc.nextInt();
        int back_number = sc.nextInt();

        System.out.println("0" + region_number + "-" + back_number + "-" + front_number);

    }
}