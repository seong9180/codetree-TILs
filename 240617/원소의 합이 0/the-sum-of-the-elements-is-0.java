import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        int[] D = new int[n];
        
        String[] input;
        
        input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        
        input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(input[i]);
        }
        
        input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            C[i] = Integer.parseInt(input[i]);
        }
        
        input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            D[i] = Integer.parseInt(input[i]);
        }
        
        // 합이 0이 되는 경우의 수를 저장할 변수
        int count = 0;
        
        // A와 B의 합을 저장할 해시맵
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // A와 B의 합을 모두 구해서 해시맵에 저장
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        
        // C와 D의 합의 반대값이 해시맵에 있는지 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = C[i] + D[j];
                count += map.getOrDefault(-sum, 0);
            }
        }
        
        // 결과 출력
        System.out.println(count);
    }
}