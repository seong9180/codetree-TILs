import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        char[] digits = n.toCharArray();

        int num = 0;
        for(int i = 0; i < digits.length; i++){
            num = num * a + Character.getNumericValue(digits[i]);
        }
        
        int[] newDigit = new int[100];
        int cnt = 0;
        while(true){
            if(num < b){
                newDigit[cnt++] = num;
                break;
            }

            newDigit[cnt++] = num % b;
            num /= b;
        }
        
        for(int i = cnt - 1; i >= 0; i--){
            System.out.print(newDigit[i]);
        }

    }
}