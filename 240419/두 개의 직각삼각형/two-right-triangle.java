import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n ; i++){
            for(int j = n; j >= i; j--){ //첫번째 직각삼각형
                System.out.print("*");
            }
            for(int d = 2 ; d <= i; d ++){ //가운데 공백 출력
                System.out.print("  ");
            }
            for(int k = n; k >= i; k--){ //세번째 직각삼각형
                System.out.print("*");
            }
            System.out.println();
        }
    }
}