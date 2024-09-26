import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int count = 0;
        
        for (int start = 0; start < N; start++) {
            for (int end = start; end < N; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
                
                double average = (double) sum / (end - start + 1);
                
                for (int i = start; i <= end; i++) {
                    if (arr[i] == average) {
                        count++;
                        break;
                    }
                }
            }
        }
        
        System.out.println(count);
        
        scanner.close();
    }
}