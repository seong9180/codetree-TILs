import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();

        while(true){
            if(b % 2 ==0){
                System.out.print(b);
                System.out.print(" ");
            }
            b--;
            if(b < a) break;
        }
        
    }
}