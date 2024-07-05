import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        a = sc.nextInt();//a일
        b = sc.nextInt();//b시간
        c = sc.nextInt();//c분

        //기준 시간
        int day = 11;
        int hour = 11;
        int minute = 11;
        //13일 3시  
        //a - day 

        //-1 출력하는 경우,
        if(a < 11){
            System.out.println(-1);
        }else if(a == 11){
            if(b < 11){
                System.out.println(-1);
            }else if(b == 11){
                if(c < 11){
                    System.out.println(-1);
                }else{
                    System.out.println(0); //두 시점이 동일한 경우 0
                }
            }
        }else{ //정상적인 케이스
            // 11시간 + 11시 + 11분을 '분' 기준으로 변환.
            int originMaxMin = (11 * 60 * 24) + (11 * 60) + 11;
            int targetMaxMin = (a * 60 * 24) + (b * 60) + c;

            int answer = targetMaxMin - originMaxMin;
            System.out.println(answer);
        }


    }
}