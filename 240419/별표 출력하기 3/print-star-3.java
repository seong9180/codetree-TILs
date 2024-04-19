import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++){
                //첫 번째 공백 출력
                System.out.print("  "); //공백 두번인 이유는 별의 출력 단위가 * + (공백) 이기 때문
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                //내부의 별 출력
                /*
                1 > 3 > 5 > 7
                n = 5
                1 > 9
                2 > 7
                3 > 5 : 10 - 5(i = 2) >> 공통점 : 2i + 1
                2 > 3 : 10 - 7(i = 3)
                1 > 1 : 10 - 9(i = 4)
                따라서 2*n - (2*i + 1) = 2n - 2i -1


                 */
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}