import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;

        while(true){
            if(n % 2 == 0){
                n = n*3 + 1;
                cnt ++;
                if(n >= 1000){
                    System.out.println(cnt);
                    break;
                }
                continue;
            }
            
            if(n % 2 != 0){
                n = n*2 + 2;
                cnt ++;
                if(n >= 1000){
                    System.out.println(cnt);
                    break;
                }
                continue;
            }
        }

            
    }
}