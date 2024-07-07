import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        char[] digits = n.toCharArray();

        int num = 0;
        for(int i = 0; i < digits.length; i++){
            num = num * 2 + Character.getNumericValue(digits[i]);
        }

        num *= 17;
        int[] newDigit = new int[100];
        int cnt = 0;
        while(true){
            if(num < 2){
                newDigit[cnt++] = num;
                break;
            }

            newDigit[cnt++] = num % 2;
            num /= 2;
        }

        for(int i = cnt - 1; i >= 0; i --){
            System.out.print(newDigit[i]);
        }
    }
}