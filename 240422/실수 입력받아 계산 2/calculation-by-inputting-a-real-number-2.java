import java.util.Scanner;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        System.out.printf("%.2f", a + 1.5);
    }
}