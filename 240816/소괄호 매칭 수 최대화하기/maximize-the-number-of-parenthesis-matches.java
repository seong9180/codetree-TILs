import java.io.*;
import java.util.*;

public class Main {
    static class Bracket implements Comparable<Bracket> {
        int open, close;
        String str;
        
        Bracket(String s) {
            this.str = s;
            for (char c : s.toCharArray()) {
                if (c == '(') open++;
                else close++;
            }
        }
        
        @Override
        public int compareTo(Bracket other) {
            int thisUnmatched = open - close;
            int otherUnmatched = other.open - other.close;
            if (thisUnmatched != otherUnmatched) {
                return otherUnmatched - thisUnmatched;
            }
            return other.close - this.close;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        List<Bracket> brackets = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            brackets.add(new Bracket(br.readLine()));
        }
        
        Collections.sort(brackets);
        
        StringBuilder sb = new StringBuilder();
        for (Bracket b : brackets) {
            sb.append(b.str);
        }
        
        String result = sb.toString();
        long score = calculateScore(result);
        
        System.out.println(score);
    }
    
    private static long calculateScore(String s) {
        long score = 0;
        long openCount = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else {
                score += openCount;
            }
        }
        
        return score;
    }
}