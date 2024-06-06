import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int length = str.length();

        //왼쪽으로 한 칸 이동
        str = str.substring(1,length) + str.substring(0,1);

        System.out.println(str);
    }
}