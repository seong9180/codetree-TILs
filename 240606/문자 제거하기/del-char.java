import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int length = s.length();
        while(true){ //문자 1개가 남을 때까지 루프
            length = s.length(); //문자열 s 변환시마다 길의 재정의
            if(length <= 1){
                break;
            }
            
            int n = sc.nextInt(); //n 번째 문자 제거해야 함.

            //예외케이스 : 주어진 정수가 문자열의 길이 이상인 경우 > 마지막 문자 제거
            //인덱스 상으로는 n-1 번째 인덱스 문자.

            if(n >= length){ //예외 케이스 처리
                //마지막 문자 제거
                s = s.substring(0,length-1);
            }else{
                //n 번째 문자 제거하고서 s문자열 재정의
                s = s.substring(0,n) + s.substring(n+1);
            }
            //매 n 입력마다 변환된 문자열 출력
            System.out.println(s);
        }
        
    }
}