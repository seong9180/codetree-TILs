import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[5][3];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.next().charAt(0); //scanner 로 char 입력 받기 위함.
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                //영문 소문자에서 -32 를 하면 대문자 출력 (아스키 코드)
                System.out.print((char)(arr[i][j] - 32)  + " ");
                //(char) 를 안 붙이면 아스키 코드(숫자) 로만 출력됨.
            }
            System.out.println();
        }
    }
}