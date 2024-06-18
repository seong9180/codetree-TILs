import java.util.Scanner;

public class Main {
    public static void reverseOne(int n){
        if(n == 0){
            return;
        }else{
            reverseOne(n-1);
            System.out.print(n + " ");
        }
    }
    public static void reverseTwo(int n ){
        if(n == 0){
            return;
        }else{
            System.out.print(n + " ");
            reverseTwo(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //재귀 1 : 1부터 n 까지 숫자를 차례대로 출력
        reverseOne(n);
        System.out.println();
        //재귀 2 : n부터 1 까지 숫자를 차례대로 출력
        reverseTwo(n);
    }
}