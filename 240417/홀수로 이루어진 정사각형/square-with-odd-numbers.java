import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i ++){
            for(int j = 1; j <= n; j++){
                System.out.print((2*(j + i) - 1) + 10);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}