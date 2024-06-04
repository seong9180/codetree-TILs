import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String stringSum = "";

        for(int i = 0 ; i < n ; i++){
            stringSum += sc.next();
        }

        for(int i = 0 ; i< stringSum.length(); i++){
            if(i != 0 && i % 5 == 0){
                System.out.println();
                System.out.print(stringSum.charAt(i));
            }else{
                System.out.print(stringSum.charAt(i));
            }
        }
    }
}