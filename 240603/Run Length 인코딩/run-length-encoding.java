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
            if(a.length() >= 10 && a.length() < 100){
                digit_count = 3;
            }else if(100 <= a.length() && a.length() < 1000){
                digit_count = 4;
            }else if(a.length() = 1000){
                digit_count = 5;
            }else{
                digit_count = 2;
            }
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