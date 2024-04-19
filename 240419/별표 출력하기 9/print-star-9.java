import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                //공백 부분
                System.out.print("  ");//별 단위에 맞춰 공백 두번
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                /*
                별 부분. ex) n = 3
                i = 1 > 1  : 2n - 5i
                i = 2 > 3  : 2n -
                i = 3 > 5  : n + i - 1 XXXXX
                그냥 2i - 1
                 */
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}