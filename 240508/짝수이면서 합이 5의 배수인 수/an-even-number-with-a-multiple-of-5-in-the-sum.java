import java.util.Scanner;

public class Main {
    public static boolean isMagicNumber(int n){
        String nText = n + "";
        char[] arr = new char[2];

        for(int i = 0; i < 2; i ++){
            arr[i] = nText.charAt(i);
        }

        //System.out.println(arr[0]);
        //System.out.println(arr[1]);
        return (n % 2 == 0) && (arr[0] + arr[1]) % 5 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(isMagicNumber(n)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
    }
}