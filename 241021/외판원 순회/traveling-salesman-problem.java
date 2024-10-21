import java.util.*;
import java.io.*;
 
public class Main {
    static int n;
    static int[][] A;
    static boolean[] visited;
    static List<Integer> list = new ArrayList<>();
    static int min = Integer.MAX_VALUE;
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        n = Integer.parseInt(br.readLine());
        A = new int[n+1][n+1];
        visited = new boolean[n+1];
 
        for(int i = 1 ; i <= n ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 1 ; j <= n ; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
 
        visited[1] = true;
        list.add(1);
        solve(1);
 
        System.out.println(min);
    }
 
    private static void solve(int cnt) {
        if(cnt == n) {
            if(A[list.get(cnt - 1)][1] != 0)    // 🔔 마지막 지점과 1번 지점까지 이동할 수 있는 경우에만 거리 구함
                min = Math.min(min, getSum());
            return;
        }
 
        for(int i = 1 ; i <= n ; i++) {
            if(!visited[i] && A[list.get(cnt - 1)][i] != 0) {    // 사용한 적 없고, 마지막 지점과 선택할 지점 간 이동이 가능한 경우 탐색 진행
                visited[i] = true;
                list.add(i);
 
                solve(cnt + 1);
 
                visited[i] = false;
                list.remove(list.size() - 1);
            }
        }        
    }
 
    private static int getSum() {
        int sum = 0;
 
        for(int i = 0 ; i < list.size() - 1 ; i++) {
            sum += A[list.get(i)][list.get(i + 1)];
        }
        sum += A[list.get(list.size() - 1)][1];    // 마지막 지점과 1번 지점 간 비용도 추가
 
        return sum;
    }
}