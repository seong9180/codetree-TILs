import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] asc_num = new int[5];

        for(int i = 0; i < 5; i ++){
            asc_num[i] = sc.nextInt();
        }

        for(int i = 0 ; i < 5; i ++){
            System.out.print((char)asc_num[i] + " ");
        }
    }
}