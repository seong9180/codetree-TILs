import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char grade = sc.next().charAt(0);

        if(grade == 'S'){
            System.out.println("Superior");
        }else if(grade == 'A'){
            System.out.println("Excellent");
        }else if(grade == 'B'){
            System.out.println("Good");
        }else if(grade == 'C'){
            System.out.println("Usually");
        }else if(grade == 'D'){
            System.out.println("Effort");
        }else{
            System.out.println("Failure");
        }
        
    }
}