import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] sortedArray = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArray[i] = sc.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            int query = sc.nextInt();
            int index = Arrays.binarySearch(sortedArray, query);
            if (index >= 0) {
                System.out.println(index + 1);  // 인덱스가 0부터 시작하므로 1을 더함
            } else {
                System.out.println(-1);
            }
        }
        
        sc.close();
    }
}