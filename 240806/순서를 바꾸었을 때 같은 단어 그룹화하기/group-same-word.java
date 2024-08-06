import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        Map<String, List<String>> groups = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            groups.putIfAbsent(sortedWord, new ArrayList<>());
            groups.get(sortedWord).add(word);
        }
        
        int maxGroupSize = 0;
        for (List<String> group : groups.values()) {
            maxGroupSize = Math.max(maxGroupSize, group.size());
        }
        
        System.out.println(maxGroupSize);
    }
}