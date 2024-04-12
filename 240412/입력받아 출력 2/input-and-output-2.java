import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("-");

        int ssn_1 = sc.nextInt();
        int ssn_2 = sc.nextInt();

        System.out.print(ssn_1);
        System.out.print(ssn_2);
    }
}