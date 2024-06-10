import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] x = new int[N];
        int[] y = new int[N];
        
        Set<Integer> uniqueX = new TreeSet<>();
        Set<Integer> uniqueY = new TreeSet<>();
        
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            uniqueX.add(x[i]);
            uniqueY.add(y[i]);
        }
        
        Integer[] uniqueXArray = uniqueX.toArray(new Integer[0]);
        Integer[] uniqueYArray = uniqueY.toArray(new Integer[0]);
        
        int result = N;
        
        for (int xi : uniqueXArray) {
            for (int yi : uniqueYArray) {
                int a = xi + 1;  // 짝수로 만들기 위해 +1
                int b = yi + 1;  // 짝수로 만들기 위해 +1
                
                int q1 = 0, q2 = 0, q3 = 0, q4 = 0;
                
                for (int i = 0; i < N; i++) {
                    if (x[i] < a && y[i] < b) q1++;
                    else if (x[i] < a && y[i] > b) q2++;
                    else if (x[i] > a && y[i] < b) q3++;
                    else if (x[i] > a && y[i] > b) q4++;
                }
                
                int maxRegion = Math.max(Math.max(q1, q2), Math.max(q3, q4));
                result = Math.min(result, maxRegion);
            }
        }
        
        System.out.println(result);
    }
}