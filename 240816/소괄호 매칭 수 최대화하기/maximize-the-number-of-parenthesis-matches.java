import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        List<String> brackets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            brackets.add(br.readLine());
        }
        
        // 각 문자열에 대해 '('의 개수에서 ')'의 개수를 뺀 값을 기준으로 정렬
        brackets.sort((a, b) -> {
            int diffA = countChar(a, '(') - countChar(a, ')');
            int diffB = countChar(b, '(') - countChar(b, ')');
            return diffB - diffA;
        });
        
        StringBuilder sb = new StringBuilder();
        for (String s : brackets) {
            sb.append(s);
        }
        
        String result = sb.toString();
        long score = calculateScore(result);
        
        System.out.println(score);
    }
    
    private static int countChar(String s, char c) {
        return (int) s.chars().filter(ch -> ch == c).count();
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