import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // "." 는 정규표현식에 사용되는 표현이기 때문에 \\를 앞에 추가해야 한다.
        sc.useDelimiter("\\.");

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        System.out.println(month + "-" + day + "-" + year);
    }
}