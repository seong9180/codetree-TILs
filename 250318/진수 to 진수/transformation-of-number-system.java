import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next(); 
        
        //A진수 N -> 10진수
        int[] digits = new int[100];
        for(int i = 0 ; i < N.length(); i++){
            digits[i] = N.charAt(i) - '0';
        }

        int num = 0;
        for(int i = 0 ; i< N.length(); i++){
            num = num * A + digits[i];
        }

        //10진수 num -> B진수
        int[] newDigits = new int[100];
        int cnt = 0;

        while(true){
            if(num < B){
                newDigits[cnt++] = num;
                break;
            }
            newDigits[cnt++] = num % B;
            num /= B;
        }

        for(int i = cnt - 1; i >= 0; i--){
            System.out.print(newDigits[i]);
        }
    }
}