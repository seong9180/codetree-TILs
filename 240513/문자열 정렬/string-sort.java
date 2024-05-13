import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int length = text.length();
        char[] arr = new char[length];

        for(int i = 0; i < length; i++){
            arr[i] = text.charAt(i);
        }

        Arrays.sort(arr);

        for(int i = 0 ; i < length; i ++){
            System.out.print(arr[i]);
        }
    }
}