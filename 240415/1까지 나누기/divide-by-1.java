import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int new_n = n;
        int cnt = 0; //나숫셈 진행 횟수 저장 변수

        for(int i = 1; i <= n; i ++){
            if((new_n / i) > 1){
                cnt += 1;
                new_n = n / i;
                //System.out.print(n + " ");
            }
            else if((new_n / i) == 0){
                break;
            }
        }
        System.out.print(cnt);
        
    }
}