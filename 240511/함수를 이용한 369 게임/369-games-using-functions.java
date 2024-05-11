import java.util.*;

public class Main {
    public static boolean isThree(int x){
        return(x % 3 == 0);
    }
    public static boolean check_one_369(int x){
        return (x % 10 == 3 || x % 10 == 6 || x % 10 == 9);
    }

    public static boolean check_one_369(String xtext, int x){
        int length = xtext.length();

        for(int i = 1 ; i <= length; i++){
            int formula = x % (10 * i);
            return (formula == 3 || formula == 6 || formula == 9);
        }

        return false;
    }

    public static boolean check_ten_369(String xtext, int x){
        int length = xtext.length();

        for(int i = 1 ; i <= length; i++){
            int formula = x / (10 * i);
            return (formula == 3 || formula == 6 || formula == 9);
        }

        return false;
    }

    public static int count_369(int x, int y){
        int count = 0;

        for(int i = x; i <= y; i++){
            String iText = i + "";
            if(check_one_369(iText,i) || check_ten_369(iText,i) || isThree(i)){
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = count_369(a,b);

        System.out.println(answer);
    }
}