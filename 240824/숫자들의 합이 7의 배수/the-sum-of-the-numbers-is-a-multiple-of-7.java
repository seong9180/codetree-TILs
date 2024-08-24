import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long sum = 0;
        int maxLength = 0;
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);
        
        for (int i = 0; i < N; i++) {
            sum += sc.nextLong();
            long remainder = sum % 7;
            
            if (map.containsKey(remainder)) {
                maxLength = Math.max(maxLength, i - map.get(remainder));
            } else {
                map.put(remainder, i);
            }
        }
        
        System.out.println(maxLength);
    }
}