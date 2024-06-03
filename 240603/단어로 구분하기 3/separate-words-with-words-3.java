import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] string = new String[10];

        for(int i = 0; i < 10; i++){
            string[i] = sc.next();
        }

        for(int i = 9; i >= 0; i--){
            System.out.println(string[i]);
        }
        
    }
}