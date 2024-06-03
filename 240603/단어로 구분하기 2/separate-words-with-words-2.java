import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] string = new String[10];

        for(int i = 0 ; i< 10; i++){
            string[i] = sc.next();
        }

        for(int i = 0 ; i< 10; i++){ //홀수 번째 문자열 : 인덱스 상으로는 짝수 번째 문자열!
            if(i % 2 == 0){
                System.out.println(string[i]);
            }
        }
    
    }
}