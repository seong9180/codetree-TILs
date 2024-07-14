import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        
        findMedians(numbers, n);
    }

    public static void findMedians(int[] numbers, int n) {
        PriorityQueue<Integer> lowerHalf = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> upperHalf = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // 홀수 번째 인덱스
                addNumber(numbers[i], lowerHalf, upperHalf);
                System.out.print(getMedian(lowerHalf, upperHalf) + " ");
            } else {
                addNumber(numbers[i], lowerHalf, upperHalf);
            }
        }
    }

    public static void addNumber(int number, PriorityQueue<Integer> lowerHalf, PriorityQueue<Integer> upperHalf) {
        if (lowerHalf.size() == 0 || number <= lowerHalf.peek()) {
            lowerHalf.add(number);
        } else {
            upperHalf.add(number);
        }
        
        balanceHeaps(lowerHalf, upperHalf);
    }

    public static void balanceHeaps(PriorityQueue<Integer> lowerHalf, PriorityQueue<Integer> upperHalf) {
        if (lowerHalf.size() > upperHalf.size() + 1) {
            upperHalf.add(lowerHalf.poll());
        } else if (upperHalf.size() > lowerHalf.size()) {
            lowerHalf.add(upperHalf.poll());
        }
    }

    public static int getMedian(PriorityQueue<Integer> lowerHalf, PriorityQueue<Integer> upperHalf) {
        if (lowerHalf.size() == upperHalf.size()) {
            return lowerHalf.peek();
        } else {
            return lowerHalf.peek();
        }
    }
}