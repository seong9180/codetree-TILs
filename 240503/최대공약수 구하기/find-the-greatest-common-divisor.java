import java.util.Scanner;

public class Main {
    public static int gcd (int n, int m){
        int max = 0;
        int gcd = 0;

        if(n >= m){
            max = n;
        }else{
            max = m;
        }

        for(int i = 1; i <= max; i++){
            if(n % i == 0 && m % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
        return gcd;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        gcd(n,m);
    }
}