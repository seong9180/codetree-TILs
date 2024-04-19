import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //System.out.println("n = " + n);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n -1 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2*(n - i) ; j++) {
                //System.out.print("i = " + i + " " + "j = " + j + "|");
                /*
                ex> n = 4
                i = 1 > 5 2n= 8 - 2i = 6
                i = 2 > 3 4
                i = 3 > 1 2
                */
                System.out.print("*");
            }
            System.out.println();
        }
    }
}