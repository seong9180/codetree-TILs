import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next(); //N
        
        int[] digits = new int[20];
        for(int i = 0; i < binary.length(); i++){
            digits[i] = binary.charAt(i) - '0';
        }

        int num = 0;
        for(int i = 0 ; i < binary.length(); i++){
            num = num * 2 + digits[i];
        }

        num *= 17; 
        int[] newDigits = new int[100];
        int cnt = 0;

        while(true){
            if(num < 2){
                newDigits[cnt++] = num;
                break;
            }
            newDigits[cnt++] = num % 2;
            num /= 2;
        }

        for(int i = cnt - 1; i >= 0; i--){
            System.out.print(newDigits[i]);
        }
    }
}