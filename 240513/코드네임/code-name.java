import java.util.Scanner;

class Agent{
    String code;
    int score;

    public Agent(String code, int score){
        this.code = code;
        this.score = score;
    }

    public Agent(){
        this.code = "no data";
        this.score = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Agent[] agents = new Agent[5];
        int min = 100;
        for(int i = 0 ; i < agents.length; i++){
            agents[i] = new Agent();
            agents[i].code = sc.next();
            agents[i].score = sc.nextInt();

            if(agents[i].score <= min) min = agents[i].score;
        }

        for(int i = 0 ; i < agents.length; i++){
            if(agents[i].score == min){
                System.out.println(agents[i].code + " " + agents[i].score);
            }
        }

    }
}