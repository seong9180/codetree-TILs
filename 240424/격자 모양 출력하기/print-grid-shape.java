import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt(); //점의 갯수

        int[][] arr = new int[n][n];

       // System.out.println("n = " + n);
        //System.out.println("m = " + m);
       // System.out.println("-----------");
        //System.out.println("초기 배열 확인");
        //System.out.println("-----------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0; //배열의 초기화
                //System.out.print(arr[i][j] + " ");
            }
            //System.out.println();
        }

        //System.out.println("-----------");
        //System.out.println("x,y 값 확인");
        //System.out.println("-----------");

        for (int i = 0; i < m; i++) { //이중for문으로 받을 필요가 없음
            int x,y = 1;
            x = sc.nextInt();
            y = sc.nextInt();
            //System.out.println("x = " + x);
            //System.out.println("y = " + y);
            arr[x-1][y-1] = x * y;
            //System.out.println(arr[x-1][y-1] + " ");

        }
        //System.out.println("근데 왜 안나옴?");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}