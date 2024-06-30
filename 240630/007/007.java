import java.util.Scanner;

class SecretCode {
    String code;
    char position;
    int time;

    public SecretCode(String code, char position, int time) {
        this.code = code;
        this.position = position;
        this.time = time;
    }

    public SecretCode() {
        this.code = "";
        this.position = ' ';
        this.time = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SecretCode code1 = new SecretCode();
        code1.code = sc.next();
        code1.position = sc.next().charAt(0);
        code1.time = sc.nextInt();

        System.out.println("secret code : " + code1.code);
        System.out.println("meeting point : " + code1.position);
        System.out.println("time : " + code1.time);
    }
}