import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b = 0;

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a + " " + b + " " + (a+b));
    }
}