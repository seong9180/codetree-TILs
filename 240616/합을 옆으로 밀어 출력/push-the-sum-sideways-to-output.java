import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        int[] arr = new int[n];
        for(int i = 0 ; i< n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        String sum_str = Integer.toString(sum);
        //System.out.println(sum_str);

        int length = sum_str.length();
        sum_str = sum_str.substring(1,length) + sum_str.charAt(0);
        System.out.println(sum_str);

    }
}