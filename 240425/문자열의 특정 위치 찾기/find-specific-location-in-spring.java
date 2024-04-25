import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char c = sc.next().charAt(0);

        //System.out.println(str);
        //System.out.println(c);

        
        System.out.print(str.indexOf(c));
    }
}