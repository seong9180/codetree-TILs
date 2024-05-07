import java.util.Scanner;

public class Main {
    public static int LCM(int n, int m){
        int min = 10000;
        for(int i = 1 ; i <= 100; i ++){
            if((n*i) % m == 0 && (n*i) <= min){
                min = n*i;
            }else if((m*i) % n == 0 && (m*i) <= min){
                min = m*i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(LCM(n,m));
    }
}