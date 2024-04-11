import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(word);
        System.out.printf("%.2f", a);
        System.out.println();
        System.out.printf("%.2f", b);

    }
}