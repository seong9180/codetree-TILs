import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //a = 97
        //z = 122

        char input = sc.next().charAt(0);
        // 아스키 변환을 통해 문자를 아스키코드로 저장
        int asc_num = (int)input;

        if(asc_num == 122){
            asc_num = 97;
        }else{
            asc_num ++;
        }

        // 아스키 변환을 통해 문자로 저장
        char asc_char = (char)asc_num;

        System.out.println(asc_char);
    }
}