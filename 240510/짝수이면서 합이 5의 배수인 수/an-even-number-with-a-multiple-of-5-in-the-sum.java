import java.util.*;

public class Main {
    public static void isMagicNumber(int n){
        int sum = 0;
        sum += n % 10;
        sum += n / 10;

        if(n % 2 == 0 && sum % 5 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        isMagicNumber(n);
    }
}