import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        
        int count = 1;
        int digit_count = 2;
        boolean same = true;

        for(int i = 0; i < a.length(); i++){
            if(i+1 < a.length() && a.charAt(i) != a.charAt(i+1)){
                same = false;
            }
        }

        if(same){
            digit_count = 2;
        }else{
            for(int i = 0 ; i < a.length(); i++){
                if(i+1 < a.length() && a.charAt(i) != a.charAt(i+1)){
                    digit_count += 2;
                }
            }
        }

        System.out.println(digit_count);

        for(int i = 0; i < a.length(); i++){
            if(i+1 < a.length() && a.charAt(i) == a.charAt(i+1)){
                count ++;
            }else{
                System.out.print(a.charAt(i));
                System.out.print(count);
                count = 1;
            }
        }
    }
}