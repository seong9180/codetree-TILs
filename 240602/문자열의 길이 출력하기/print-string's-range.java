import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text1 = sc.next();
        String text2 = sc.next();

        int text1_length = text1.length();
        int text2_length = text2.length();

        System.out.println(text1_length + text2_length);
    }
}