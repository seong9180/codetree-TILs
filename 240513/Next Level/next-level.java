import java.util.Scanner;

class Account{
    String id;
    int lv;

    public Account(String id, int level){
        this.id = id;
        this.lv = level;
    }

    public Account(){
        this.id = "no data";
        this.lv = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int level = sc.nextInt();

        Account user_1 = new Account();
        Account user_2 = new Account(id,level);

        user_1.id = "codetree";
        user_1.lv = 10;

        System.out.println("user " + user_1.id + " lv " + user_1.lv);
        System.out.println("user " + user_2.id + " lv " + user_2.lv);

    }
}