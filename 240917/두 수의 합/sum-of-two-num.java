import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();
    static StringTokenizer st;
    static int n;
    static long k;
    static long[] inputArr;
    static void input() throws IOException{

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Long.parseLong(st.nextToken());

        inputArr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            inputArr[i] = Long.parseLong(st.nextToken());
        }
    }

    static void pro() throws IOException{

        int cnt = 0;
        HashMap<Long, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long diff = k - inputArr[i];
            if (hashMap.containsKey(diff)) cnt += hashMap.get(diff);
            hashMap.put(inputArr[i],hashMap.getOrDefault(inputArr[i], 0) + 1);
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException{
        input();
        pro();
    }

}