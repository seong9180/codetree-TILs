import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nfit = sc.nextDouble();

        double convert_to_cm = 0;
        convert_to_cm = nfit * 30.48 ;

        System.out.printf("%.1f", convert_to_cm);
    }
}