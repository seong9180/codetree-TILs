import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n == 1 ){
            System.out.print("* ");
        }else{

        /*
        첫줄, 마지막줄은 n번만큼 출력.
        i == n - 1 에서는

         */
            //i == 0 일때 n 만큼 출력
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();

            for (int i = 1; i < n - 1 ; i++) { //i == 0 일때 출력을 정해놔서 i = 1 부터 for문 시작

                for (int j = i; j <= i; j++) { //매 줄마다 마지막에 별 출력
                    System.out.print("* ");
                }

                for (int j = 1; j < i; j++) {
                    System.out.print("* ");
                }

                for (int j = n- 1; j > i; j--) {
                    //공백 n-2 부터 하나씩 줄어드는 형태
                    System.out.print("  ");
                }

                for (int j = i; j <= i; j++) { //매 줄마다 마지막에 별 출력
                    System.out.print("* ");
                }
                System.out.println() ;
            }

            // i == n 일때 n 만큼 출력
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        
        }
    }
}