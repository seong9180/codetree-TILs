import java.util.Scanner;

public class Main {
    public static int n;
    public static int divider = 1000000007;
    public static int fillWithBlocks(int n){
        if(n == 1){
            return 2;
        }else if(n == 2){
            return 7;
        }else if(n > 2 && n % 2 != 0){
            return (3 * 2) + (fillWithBlocks(n-1) - 3) * 4;
        }else{
            return (2 * 2) + (fillWithBlocks(n-1) - 2) * 4;
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