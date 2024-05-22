import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int score = sc.nextInt();

            if(score == 1){
                System.out.println("John");
            }else if(score == 2){
                System.out.println("Tom");
            }else if(score == 3){
                System.out.println("Paul");
            }else if(score == 4){
                System.out.println("Sam");
            }else{
                System.out.println("Vacancy");
                break;
            }
        }
    }
}