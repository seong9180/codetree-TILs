import java.util.Scanner;

class Secret{
    String code;
    char point;
    int time;

    public Secret(String code, char point, int time){
        this.code = code;
        this.point = point;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        char meeting_point = sc.next().charAt(0);
        int time = sc.nextInt();

        Secret agent_1 = new Secret(code,meeting_point,time);
        System.out.println("secret code : " + agent_1.code);
        System.out.println("meeting point : " + agent_1.point);
        System.out.println("time : " + agent_1.time);

    }
}