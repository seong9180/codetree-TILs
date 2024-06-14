import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = Integer.toString(n);
        char[] arr = str.toCharArray();

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            //System.out.println(arr[i]);
            sum += arr[i] - '0'; //char 변수를 int 로 변환해서 sum 에 더함
        }

        System.out.println(sum);
    }
}