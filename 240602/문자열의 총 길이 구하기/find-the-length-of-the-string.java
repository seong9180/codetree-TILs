import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] string = new String[10];
        int sum = 0;

        for(int i = 0 ; i < 10; i++){
            string[i] = sc.next();
            sum += string[i].length();
        }

        System.out.println(sum);
        
    }
}