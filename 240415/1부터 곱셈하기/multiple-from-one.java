import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mxt = 1;

        for(int i = 1; i <= 10; i++){
            mxt *= i;

            if(mxt >= n){
                System.out.print(i);
                break;
            }
        }
        
    }
}