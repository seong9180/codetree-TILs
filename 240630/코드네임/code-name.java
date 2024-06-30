//package study.codetree.mid.sort.instance;
import java.util.Scanner;

class Codename {
    char name;
    int score;

    public Codename(char name, int score) {
        this.name = name;
        this.score = score;
    }

    public Codename() {
        this.name = ' ';
        this.score = 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Codename[] agent = new Codename[5];
        for (int i = 0; i < 5; i++) {
            char name = sc.next().charAt(0);
            int score = sc.nextInt();
            agent[i] = new Codename(name, score);
        }

        int score_max = 100;
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (agent[i].score <= score_max) {
                score_max = agent[i].score;
                index = i;
            }
        }
        System.out.println(agent[index].name + " " + agent[index].score);
    }
}