import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0; //문자열의 개수 카운트
        String[] str = new String[200];

        while(true){
            String s = sc.next();
            
            if(s.equals("0")){
                break;
            }else{
                str[count] = s;
                count ++;
            }
        }
        System.out.println(count);

        for(int i = 0; i < count; i ++){
            if(i %2 == 0){ //홀수 번째 주어진 문자 ==> 배열 안에는 짝수 번째 (0번째 부터 시작이기 떄문)
                System.out.println(str[i]);
            }
        }
    }
}