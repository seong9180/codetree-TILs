import java.util.Scanner;

class Agent {
    String codename;
    int score;

    Agent(String codename, int score) {
        this.codename = codename;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agent[] agents = new Agent[5];
        Agent lowestScoreAgent = null;

        for (int i = 0; i < 5; i++) {
            String codename = scanner.next();
            int score = scanner.nextInt();
            agents[i] = new Agent(codename, score);

            if (lowestScoreAgent == null || agents[i].score < lowestScoreAgent.score) {
                lowestScoreAgent = agents[i];
            }
        }

        System.out.println(lowestScoreAgent.codename + " " + lowestScoreAgent.score);
        scanner.close();
    }
}