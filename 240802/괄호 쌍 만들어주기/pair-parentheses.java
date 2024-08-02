import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brackets = sc.nextLine();
        
        System.out.println(countBracketPairs(brackets));
    }
    
    public static long countBracketPairs(String brackets) {
        List<Integer> openPairs = new ArrayList<>();
        List<Integer> closePairs = new ArrayList<>();
        
        int openCount = 0;
        int closeCount = 0;
        
        // 연속된 여는 괄호와 닫는 괄호의 시작 위치를 찾습니다.
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                if (openCount == 0) openPairs.add(i);
                openCount++;
                closeCount = 0;
            } else {
                if (closeCount == 0) closePairs.add(i);
                closeCount++;
                openCount = 0;
            }
        }
        
        long count = 0;
        int openIndex = 0;
        
        // 각 닫는 괄호 그룹에 대해 가능한 여는 괄호 그룹의 수를 계산합니다.
        for (int closePos : closePairs) {
            while (openIndex < openPairs.size() && openPairs.get(openIndex) < closePos) {
                openIndex++;
            }
            count += openIndex;
        }
        
        return count;
    }
}