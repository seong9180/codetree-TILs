import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        for(int i = 0 ; i < 10 ;i ++){
            int x = sc.nextInt();
            if(x >= max){
                max = x;
            }
        }

        System.out.println(max);
    }
}