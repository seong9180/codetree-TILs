import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        scanner.close();

        char[] variables = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] values = {1, 2, 3, 4};
        int maxResult = Integer.MIN_VALUE;

        // Generate all combinations of values for variables
        int[] currentCombination = new int[6];
        maxResult = findMaxResult(expression, variables, values, currentCombination, 0, maxResult);

        System.out.println(maxResult);
    }

    private static int findMaxResult(String expression, char[] variables, int[] values, int[] currentCombination, int depth, int maxResult) {
        if (depth == 6) {
            // Assign the generated combination of values to variables
            Map<Character, Integer> variableValues = new HashMap<>();
            for (int i = 0; i < 6; i++) {
                variableValues.put(variables[i], currentCombination[i]);
            }
            // Evaluate the expression with the current variable values
            int result = evaluateExpression(expression, variableValues);
            // Update maxResult if current result is greater
            return Math.max(maxResult, result);
        } else {
            // Generate combinations by assigning values[depth] to variables[depth]
            for (int value : values) {
                currentCombination[depth] = value;
                maxResult = findMaxResult(expression, variables, values, currentCombination, depth + 1, maxResult);
            }
        }
        return maxResult;
    }

    private static int evaluateExpression(String expression, Map<Character, Integer> variableValues) {
        int result = 0;
        char currentOperator = '+';
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isLetter(c)) {
                int value = variableValues.get(c);
                switch (currentOperator) {
                    case '+':
                        result += value;
                        break;
                    case '-':
                        result -= value;
                        break;
                    case '*':
                        result *= value;
                        break;
                }
            } else {
                currentOperator = c;
            }
        }
        return result;
    }
}