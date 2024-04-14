import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = 0; i < b; i++){
            if(a <= 0){
                System.out.print("0");
                break;
            }else{
                System.out.print(a);
            }
        }
    }
}