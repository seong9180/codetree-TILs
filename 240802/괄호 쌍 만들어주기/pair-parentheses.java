import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brackets = sc.nextLine();
        
        System.out.println(countBracketPairs(brackets));
    }
    
    public static int countBracketPairs(String brackets) {
        List<Integer> openPairs = new ArrayList<>();
        List<Integer> closePairs = new ArrayList<>();
        
        // 연속된 두 개의 여는 괄호와 닫는 괄호의 위치를 찾습니다.
        for (int i = 0; i < brackets.length() - 1; i++) {
            if (brackets.charAt(i) == '(' && brackets.charAt(i+1) == '(') {
                openPairs.add(i);
            } else if (brackets.charAt(i) == ')' && brackets.charAt(i+1) == ')') {
                closePairs.add(i);
            }
        }
        
        int count = 0;
        int openIndex = 0;
        
        // 각 닫는 괄호 쌍에 대해 가능한 여는 괄호 쌍의 수를 계산합니다.
        for (int closePos : closePairs) {
            while (openIndex < openPairs.size() && openPairs.get(openIndex) < closePos) {
                openIndex++;
            }
            count += openIndex;
        }
        
        return count;
    }
}