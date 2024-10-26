import java.util.*;
import java.io.*;

class Pair{
    int x;
    int y;

    Pair(){}

    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static int n, m, res = 20000;
    static final int IDX = 100;
    static Pair arr[];
    public static void main(String[] args) throws IOException{
        arr = new Pair[IDX];
        Arrays.setAll(arr, i -> new Pair());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            arr[i].x = Integer.parseInt(st.nextToken());
            arr[i].y = Integer.parseInt(st.nextToken());
        }

        solution();
    }

    static void solution(){
        Pair[] temp = new Pair[m];
        Arrays.setAll(temp, i -> new Pair());

        bf(0, 0, temp);

        System.out.println(res);
    }

    static void bf(int k, int cnt, Pair[] temp){
        if(cnt == m) {
            calc(temp);

            return;
        }
        for(int i=k; i<n; i++){
            temp[cnt].x = arr[i].x;
            temp[cnt].y = arr[i].y;

            bf(i+1, cnt+1, temp);
        }
    }

    static void calc(Pair[] temp){
        int val = -1;

        for(int i=0; i<m; i++){
            Pair a = new Pair(temp[i].x, temp[i].y);

            for(int j=i+1; j<m; j++){
                Pair b = new Pair(temp[j].x, temp[j].y);

                int ds0 = (a.x - b.x) * (a.x - b.x);
                int ds1 = (a.y - b.y) * (a.y - b.y);

                val = Math.max(val, ds0+ds1);
            }
        }

        res = Math.min(res, val); 
    }
}