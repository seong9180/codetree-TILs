import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //가지고 있는 돈
        int n = sc.nextInt();

        int compare_book = n - 3000;
        int compare_mask = n - 1000;

        if(n < 1000){
            System.out.println("no");
        }
        else if(n < 3000){
            System.out.println("mask");
        }
        else{
            System.out.println("book");
        }
        
    }
}