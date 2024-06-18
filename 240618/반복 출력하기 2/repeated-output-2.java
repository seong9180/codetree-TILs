import java.util.Scanner;

public class Main {
    public static void sayHello(int n){
        if(n == 0){
            return;
        }else{
            System.out.println("HelloWorld");
            sayHello(n-1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sayHello(n);

    }
}