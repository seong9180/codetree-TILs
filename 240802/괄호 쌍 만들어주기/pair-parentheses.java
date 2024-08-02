import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brackets = sc.nextLine();
        
        System.out.println(countBracketPairs(brackets));
    }
    
    public static long countBracketPairs(String brackets) {
        Stack<Integer> openStack = new Stack<>();
        List<Integer> closePairs = new ArrayList<>();
        
        // 연속된 여는 괄호와 닫는 괄호의 위치를 찾습니다.
        for (int i = 0; i < brackets.length() - 1; i++) {
            if (brackets.charAt(i) == '(' && brackets.charAt(i+1) == '(') {
                openStack.push(i);
            } else if (brackets.charAt(i) == ')' && brackets.charAt(i+1) == ')') {
                closePairs.add(i);
            }
        }
        
        long count = 0;
        
        // 각 닫는 괄호 쌍에 대해 가능한 여는 괄호 쌍의 수를 계산합니다.
        for (int closePos : closePairs) {
            while (!openStack.isEmpty() && openStack.peek() > closePos) {
                openStack.pop();
            }
            count += openStack.size();
        }
        
        return count;
    }
}