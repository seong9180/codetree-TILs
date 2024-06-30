//package study.codetree.mid.sort.instance;

import java.util.Scanner;

class DisarmCode {
    String code;
    char lineColor;
    int specificTime;

    public DisarmCode(String code, char lineColor, int specificTime) {
        this.code = code;
        this.lineColor = lineColor;
        this.specificTime = specificTime;
    }

    public DisarmCode() {
        this.code = " ";
        this.lineColor = ' ';
        this.specificTime = 0;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DisarmCode bomb1 = new DisarmCode();
        bomb1.code = sc.next();
        bomb1.lineColor = sc.next().charAt(0);
        bomb1.specificTime = sc.nextInt();

        System.out.println("code : " + bomb1.code);
        System.out.println("color : " + bomb1.lineColor);
        System.out.println("second : " + bomb1.specificTime);
    }
}