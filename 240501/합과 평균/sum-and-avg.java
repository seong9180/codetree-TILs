import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double avg = ((double)a + (double)b) / 2;

        System.out.print(a+b + " ");
        System.out.printf("%.1f", avg);    
    }
}