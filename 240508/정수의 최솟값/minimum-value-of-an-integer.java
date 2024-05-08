import java.util.Scanner;

public class Main {
    public static int min(int a, int b, int c){
        int min = 100;
        
        if(a <= b && a <= c){
            min = a;
        }else if(b <= a && b <= c){
            min = b;
        }else if(c <= a && c <= b){
            min = c;
        }

        return min;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(min(a,b,c));
    }
}