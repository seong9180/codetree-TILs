import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입력
        int input = sc.nextInt();
        
        if(1 <input < 5){
            System.out.println("tiny");
        }
        else{
            System.out.println(input*input);
        }
    }
}