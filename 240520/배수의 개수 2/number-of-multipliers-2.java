import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int odd_count = 0;

        for(int i = 0 ; i < 10; i++){
            int x = sc.nextInt();

            if(x % 2 != 0){
                odd_count ++;
            }
        }

        System.out.print(odd_count);
    }
}