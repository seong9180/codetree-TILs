import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        findMedians(numbers);
    }

    public static void findMedians(int[] numbers) {
        PriorityQueue<Integer> low = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> high = new PriorityQueue<>();
        
        for (int i = 0; i < numbers.length; i++) {
            if (low.isEmpty() || numbers[i] <= low.peek()) {
                low.offer(numbers[i]);
            } else {
                high.offer(numbers[i]);
            }
            
            if (low.size() > high.size() + 1) {
                high.offer(low.poll());
            } else if (high.size() > low.size()) {
                low.offer(high.poll());
            }
            
            if ((i + 1) % 2 == 1) {
                System.out.print(low.peek() + " ");
            }
        }
    }
}