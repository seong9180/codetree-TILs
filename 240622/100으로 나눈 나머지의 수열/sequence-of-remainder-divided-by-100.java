import java.util.Scanner;

public class Main {
    public static int functionA(int n){
        if(n == 1){
            return 2;
        }else if(n == 2){
            return 4;
        }

        return (functionA(n-1) * functionA(n-2)) % 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //f(1) = 2
        //f(2) = 4
        //f(n) = ((n-1) * (n-2)) % 100 (n > 2)
        //f(n) 의 값은?

        int answer = functionA(n);
        System.out.println(answer);
    }
}