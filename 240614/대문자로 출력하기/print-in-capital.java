import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] alpha = s.toCharArray();
        
        for(int i = 0; i < alpha.length; i ++){
            int alpha_num = (int)alpha[i];
            if(alpha_num >= 65 && alpha_num <= 90){ //대문자
                System.out.print(alpha[i]);
            }else if(alpha_num >= 97 & alpha_num <= 122){ //소문자
                alpha_num -= 97; // - 'a'
                alpha_num += 65; // + 'A'
                System.out.print((char)alpha_num);
            }
        }
        
    }
}