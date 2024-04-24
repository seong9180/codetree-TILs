import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = 20;

        for (int i = 0; i < 3; i++) {
            String sentence = sc.nextLine();
            if (sentence.length() > max) {
                max = sentence.length();
            }
            if (sentence.length() < min) {
                min = sentence.length();
            }
        }

        System.out.println(max - min);
    }
}