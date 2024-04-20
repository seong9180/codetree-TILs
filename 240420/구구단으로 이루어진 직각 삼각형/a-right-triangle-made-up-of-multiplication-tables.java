import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int cnt = 0;
            for(int j = n; j >= i; j--){
                cnt ++;
                System.out.print(i + " * " + cnt + " = " + (i * cnt));
                if(j > i){
                    System.out.print(" / ");
                }
                
            }
            System.out.println();
        }
        
    }
}