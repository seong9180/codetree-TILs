import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double sum = a + b;
        double sub = a - b;

        System.out.printf("%.2f", sum / sub);
        
    }
}