import java.util.Scanner;

public class Main {
    public static int a,b,c,d;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        //2011 11 월 11일 a,b 일 시작
        //2011 11 월 11일 c,d 분 종료

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int exclusive_time = Math.abs(c-a) * 60;
        if(d > b){ //d 분 자체로 b 분 보다 뒤
            exclusive_time += (d - b);
        }else if (d < b){
            exclusive_time -= (b - d);
        }

        System.out.println(exclusive_time);
        
    }
}