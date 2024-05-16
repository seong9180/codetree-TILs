import java.util.Scanner;

public class Main {
    public static int n;
    public static void whatWeather(int n){
        if(3<= n && n <= 5){
            System.out.println("Spring");
        }else if(6 <= n && n <= 8){
            System.out.println("Summer");
        }else if(9 <= n && n <= 11){
            System.out.println("fall");
        }else{
            System.out.println("Winter");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        whatWeather(n);

    }
}