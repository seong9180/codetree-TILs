import java.util.Scanner;

public class Main {
    public static int n;

    public static void isGreatNumber(int x){
        if(x % 2 != 0 && x % 3 == 0){
            System.out.println("true");
        }else if(x % 2 ==0 && x % 5 ==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        isGreatNumber(n);

    }
}