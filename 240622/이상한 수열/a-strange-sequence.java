import java.util.Scanner;

public class Main {
    public static int functionA(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }

        return functionA(n/3) + functionA(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = functionA(n);
        System.out.println(answer);
    }
}