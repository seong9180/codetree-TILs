import java.util.*;

public class Main {
    static char[] variables = {'a', 'b', 'c', 'd', 'e', 'f'};
    static int[] values = new int[6];
    static Map<Character, Integer> variableMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        scanner.close();
        
        // initialize variableMap with all variables set to 1 initially
        for (int i = 0; i < variables.length; i++) {
            variableMap.put(variables[i], 1);
        }

        int maxResult = Integer.MIN_VALUE;

        // generate all possible combinations of values for a to f (1 to 4)
        for (values[0] = 1; values[0] <= 4; values[0]++) {
            for (values[1] = 1; values[1] <= 4; values[1]++) {
                for (values[2] = 1; values[2] <= 4; values[2]++) {
                    for (values[3] = 1; values[3] <= 4; values[3]++) {
                        for (values[4] = 1; values[4] <= 4; values[4]++) {
                            for (values[5] = 1; values[5] <= 4; values[5]++) {
                                // update variableMap with current combination of values
                                for (int i = 0; i < variables.length; i++) {
                                    variableMap.put(variables[i], values[i]);
                                }
                                int result = evaluateExpression(expression);
                                maxResult = Math.max(maxResult, result);
                            }
                        }
                    }
                }
            }
        }

        System.out.println(maxResult);
    }

    // Evaluate the expression with current values of variables
    public static int evaluateExpression(String expression) {
        int result = 0;
        int currentNumber = 0;
        char currentOp = '+';
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (Character.isLetter(ch)) {
                currentNumber = variableMap.get(ch);
            }
            
            if (!Character.isLetter(ch) || i == expression.length() - 1) {
                if (i == expression.length() - 1 && Character.isLetter(ch)) {
                    i++; // Move index to end
                }
                switch (currentOp) {
                    case '+':
                        result += currentNumber;
                        break;
                    case '-':
                        result -= currentNumber;
                        break;
                    case '*':
                        result *= currentNumber;
                        break;
                }
                if (i < expression.length()) {
                    currentOp = expression.charAt(i);
                }
            }
        }
        
        return result;
    }
}