import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 100; i++){
            int x = sc.nextInt();

            if(x == 0){
                break;
            }

            if( x % 2 != 0){
                System.out.print(x + 3 + " ");
            }else{
                System.out.print(x / 2 + " ");
            }

        }
    }
}