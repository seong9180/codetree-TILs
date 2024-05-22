import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int mux = 1;

        for(int i = a; i <= b; i++){
            mux *= i;
        }

        System.out.println(mux);
    }
}