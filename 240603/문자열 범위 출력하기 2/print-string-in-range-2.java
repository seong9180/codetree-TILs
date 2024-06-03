import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.next();
        int number = sc.nextInt();
        int length = string.length();
        int count = 0;
        for(int i  = length - 1; i >= 0; i --){
            if(count  >= number){
                break;
            }else{
                System.out.print(string.charAt(i));
                count ++;
            }
        }
        
    }
}