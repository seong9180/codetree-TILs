import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text_with_blank = sc.nextLine();
        //3번째 문자부터 10번 문자까지 순서대로 출력
        //> index 기준으로 3번째 문자 = charAt(2);
        for(int i = 2; i < 10; i++){
            System.out.print(text_with_blank.charAt(i));
        }
    }
}