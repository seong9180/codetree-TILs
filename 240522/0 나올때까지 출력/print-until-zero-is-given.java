import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int x = sc.nextInt();

            if(x == 0){
                break;
            }else{
                System.out.println(x);
            }
        }
    }
}