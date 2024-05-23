import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while(true){
            if(n / 2 == 1){
                count ++;
                System.out.println(count);
                break;
            }else{
                n /= 2;
                count ++;
            }
        }


        
    }
}