//package study.codetree.mid.sort.instance;

import java.util.Scanner;

class Character{
    String id;
    int level;

    public Character (String id, int level) {
        this.id = id;
        this.level = level;
    }

    public Character() {
        this.id = "";
        this.level = 0;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Character user1 = new Character("codetree", 10);

        Character user2 = new Character();
        user2.id = sc.next();
        user2.level = sc.nextInt();

        System.out.println("user " + user1.id + " lv " + user1.level);
        System.out.println("user " + user2.id + " lv " + user2.level);
    }
}