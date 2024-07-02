import java.util.Scanner;

public class Main {
    public static int n;
    public static int divider = 1000000007;
    public static int fillWithBlocks(){
        if(n == 1){
            return 2;
        }else{
            return 7 * n;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int answer = fillWithBlocks() % divider;
        System.out.println(answer);
    }
}