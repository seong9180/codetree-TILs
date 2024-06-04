import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char alphaSecond = str.charAt(1); // 두 번째 문자
        char alphaFirst = str.charAt(0);; // 첫 번째 문자
        //문자를 배열에 저장 #방법 1
        char[] charArray = str.toCharArray; //이렇게 문자열을 바로 배열에 넣을 수 있다. 기억해두기
        //StringBuilder 이용 #방법 2
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0 ; i < sb.length(); i ++){
            if(sb.charAt(i) == alphaSecond){
                sb.setCharAt(i, alphaFirst); 
                //sb.charAt(i) = alphaFirst 같이 작성하면 오류! 
                //sb.setCharAt(x,y) 를 이용해보자
            }
        }

        System.out.println(sb.toString());

    }
}