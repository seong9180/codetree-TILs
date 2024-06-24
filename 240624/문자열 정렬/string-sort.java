import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        
    }
}