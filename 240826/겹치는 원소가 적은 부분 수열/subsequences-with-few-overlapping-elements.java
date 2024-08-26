import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(longestSubsequence(arr, k));
    }
    
    public static int longestSubsequence(int[] arr, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < arr.length; right++) {
            count.put(arr[right], count.getOrDefault(arr[right], 0) + 1);
            
            while (count.get(arr[right]) > k) {
                count.put(arr[left], count.get(arr[left]) - 1);
                if (count.get(arr[left]) == 0) {
                    count.remove(arr[left]);
                }
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}