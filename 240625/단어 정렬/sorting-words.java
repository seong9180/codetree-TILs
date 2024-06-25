import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] alpha = new String[n];
        for(int i = 0 ; i < n; i ++){
            alpha[i] = sc.next();
        }
        Arrays.sort(alpha);
        for(int i = 0 ; i < n; i++){
            System.out.println(alpha[i]);
        }
    }
}