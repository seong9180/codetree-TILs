import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            //첫번째 역삼각형 모양 출력
            for (int j = -1; j < i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            //두번째 삼각형 모양 출력
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 2 * (n - i + 1) - 1 ; j > 0 ; j--) {
                /*
                i = 2 > 3
                i = 1 > 5
                 */
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}