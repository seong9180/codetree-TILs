import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n < 500){
            System.out.println("no");
        }
        else if(n < 1000){
            System.out.println("pen");
        }
        else if(n < 3000){
            System.out.println("mask");
        }
        else{
            System.out.println("book");
        }
    }
}