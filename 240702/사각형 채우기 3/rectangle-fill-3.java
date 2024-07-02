import java.util.Scanner;

public class Main {
    public static int n;
    public static int divider = 1000000007;
    public static int fillWithBlocks(int n){
        if(n == 1){
            return 2;
        }else{
            return 3 * (fillWithBlocks(n-1)) + 1;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int answer = fillWithBlocks(n) % divider;
        System.out.println(answer);
    }
}