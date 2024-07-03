import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int P = scanner.nextInt();
        int T = scanner.nextInt();
        
        List<Handshake> handshakes = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int t = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            handshakes.add(new Handshake(t, x, y));
        }
        
        Collections.sort(handshakes, Comparator.comparingInt(h -> h.time));
        
        boolean[] infected = new boolean[N + 1];
        int[] infectionCount = new int[N + 1];
        
        infected[P] = true;
        
        for (Handshake handshake : handshakes) {
            int x = handshake.x;
            int y = handshake.y;
            
            boolean xWasInfected = infected[x];
            boolean yWasInfected = infected[y];
            
            if (xWasInfected && infectionCount[x] < K) {
                infected[y] = true;
                infectionCount[x]++;
            }
            if (yWasInfected && infectionCount[y] < K) {
                infected[x] = true;
                infectionCount[y]++;
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            result.append(infected[i] ? 1 : 0);
        }
        
        System.out.println(result.toString());
    }
}

class Handshake {
    int time;
    int x;
    int y;
    
    Handshake(int time, int x, int y) {
        this.time = time;
        this.x = x;
        this.y = y;
    }
}