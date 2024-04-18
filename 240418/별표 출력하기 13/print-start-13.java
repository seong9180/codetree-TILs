import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        열 갯수 : n * 2
        첫 열 : n
        둘째 열 : 1
        셋째 열 : n - 1
        넷째 열 : n - 2

        홀수행 n -1
        짝수행은 1,2,3...
        n이 짝수인 경우, n열과 n+1 열을 기준으로 대칭
        n이 홀수인 경우, n 열과 n+1 열을 기준으로 대칭
         */

        int n = sc.nextInt();
        // if (n % 2 == 0) {//짝수이면

        for (int i = 1; i <= n; i++) { //1 2 3 4 ... n
            if(i % 2 == 0) {//짝수행이면
                // 2..4...6...8
                for (int j = 1 ; j <= i/2 ; j++) { //1..2..3..4..5 로 나와야 함
                    System.out.print("* ");
                }
            }
            else{//홀수행이면 1..3..5..7..9
                //1일떄 n, 3일때 n-1, 5일때 n-2...
                for (int j = n   ; j > i/2  ; j--) {
                    //n:6>j:12>i:1 ||| i:3 n:3 j:4 2 ||| i:5
                    //i = 2x + 1 일 때, 2*i + 1
                    /*
                    n = 5
                    i == 3, 값은 4가 나오도록. 5.4.3,2 ( i - 1 )
                    i == 1, 값은 5가 나오도록. 5,4,3,2,1,0 => 6 . 따라서 i- 1 은  X

                    n = 5
                    i == 5 값은 3가 나오도록, 5,4,3 == i - 2
                    i == 3 값은 4가 나오도록, 5,4,3,2 == i - 1
                    i == 1 값은 5가 나오도록, 5,4,3,2,1 == i
                    꼭 j 값이 n으로 이루어져야할까

                    int j = 1이라면 ,i =  1 일때 5가 나와야하는데
                    int j = 0; j < n;
                    int j = 0 ' j < 2(n - i) >
                    n = 5, i = 1, j < 8 (x)
                    int j = i ; j < 2(n - i) >
                    n = 5, j = 1, i = 1 j < 8 (x)
                     */
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {//6...4..2..
                for (int j = i / 2; j >= 1; j--) {
                    System.out.print("* ");
                }
            }
            else{ //5..3..2..1
                for (int j = i / 2; j < n; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}