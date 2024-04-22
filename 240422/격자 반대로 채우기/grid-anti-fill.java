import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int initial = 1; //n^2 연산을 진행 할 초기 변수 선언

        /*
        n*n 격자에서 index (n,n) 부터 시작
        (n,n) > (n,n-1) > (n,n-2) > (n,n-3) > (n-1, n-3)
        if(j == n-3) > i == n-1

         */

        //이차원 배열 선언
        int[][] arr = new int[n][n];

        //인덱스를 n*n 부터 접근하기 위해 for문의 i,j 를 n 부터 시작
        for (int i = n - 1; i >= 0; i--) {
            if(i % 2 == 0){ // i 가 짝수인 경우
                for (int j = n - 1; j >= 0; j--) { //배열의 크기가 N 이라서.
                    arr[j][i] = initial;

                    //System.out.println("j, i, initial = " + j +" " + i + " " + initial);
                    initial++;
                }
            }else{ // i 가 홀수인 경우
                for (int j = 0; j  < n ; j++) {
                    arr[j][i] = initial;

                    //System.out.println("   j, i, initial = " + j +" " + i + " " + initial);
                    initial++;
                }
            }/* else { //i == 0
                for (int j = n - 1; j >= 0; j--) { //배열의 크기가 N 이라서.
                    arr[j][i] = initial;
                    System.out.println("   j, i, initial = " + j +" " + i + " " + initial);
                    initial++;
                }
            }*/
            /*
                N = 4
                I = 0 , 1, 2, ,3
                I = 3
                    j = 0
                    j = 1
                    j = 2
                    j = 3
                I = 2
                    j = 3
                    j = 2
                    j = 1
                    j = 0
                I = 1
                    j = 0
                    j = 1
                    j = 2
                    j = 3
                I = 0
                    j = 3
                    j = 2
                    j = 1
                    j = 0
             */
            /*
            for (int j = 0; j < n; j++) {
                //System.out.println("arr[" + i + "][" + j + "]");
                //System.out.print("   arr[" + i + "]" + "][" + j + "] = " + arr[i][j] + " ");
                System.out.print(arr[j][i] + " ");
            }

             */

            //System.out.println();
        }

        for (int i = n -1 ; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //System.out.println("0 % 2 는 = " + (0 % 2));
    }
}