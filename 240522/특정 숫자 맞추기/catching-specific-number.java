import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int x = sc.nextInt();

            if(x < 25){
                System.out.println("Higher");
            }else if(x > 25){
                System.out.println("Lower");
            }else{
                System.out.println("Good");
                break;
            }
        }
    }
}