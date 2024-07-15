import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거
        String[] arr = sc.nextLine().split(" ");
        
        int swaps = getMinimumSwaps(arr);
        System.out.println(swaps);
    }
    
    public static int getMinimumSwaps(String[] arr) {
        int n = arr.length;
        int swaps = 0;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j + 1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        
        return swaps;
    }
}