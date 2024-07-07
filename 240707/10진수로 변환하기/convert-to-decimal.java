import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int length = s.length();
        char[] digit = s.toCharArray();

        int num = 0;
        for(int i = 0 ;i < length; i++){
            num = num * 2 + Character.getNumericValue(digit[i]);
            // (char) -> (int)
            // 1. Character.getNumericValue(char)
            // 2. char - '0'

            // (String) -> (int)
            // 1. Integer.parseInt(String)
        }

        System.out.print(num);

    }
}