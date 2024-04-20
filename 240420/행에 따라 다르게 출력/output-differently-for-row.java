import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int value = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    value++;
                    System.out.print(value + " ");
                    continue;
                }
                else{
                    value += 2;
                    System.out.print(value + " ");
                    continue;
                }

            }
            System.out.println();
        }
    }
}