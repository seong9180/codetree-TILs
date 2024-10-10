import java.io.*;
import java.util.*;
import java.math.*;


public class Main {

    static int[][] arr;
    static int[][] mar;
    static int n;

    //구슬 움직이기

    static void move(){
        int[][] newmar = new int[n+1][n+1];
       

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(mar[i][j] == 1){

                    int max = 0;
                    int mx = 0;
                    int my = 0;

                    for(int k = 0;k<4;k++){
                        if( i + dx[k] >= 1 && i + dx[k] <= n &&
                            j + dy[k] >= 1 && j + dy[k] <= n && max < arr[i + dx[k]][j + dy[k]]){
                            mx = i + dx[k];
                            my = j + dy[k];
                            max = arr[i + dx[k]][j + dy[k]];
                        }

                    }

                    newmar[mx][my] += 1;

                }
            }
        }

         for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                mar[i][j] = newmar[i][j];
            }
        }
        remove();
    }

    // 겹치는 구슬 없애기

    static void remove(){
        for(int i = 1;i<=n;i++){
           
            for(int j = 1;j<=n;j++){
                
               if(mar[i][j] >= 2){
                mar[i][j] = 0;
               }
            }
        }
    }



    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        
         arr = new int[n+1][n+1];
         mar = new int[n+1][n+1];

        for(int i = 1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j =1;j<=n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i =0;i<m;i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            mar[a][b] = 1;
        }

        for(int i = 0;i<t;i++){
            move();
        }

        int ans = 0;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                ans += mar[i][j];
            }
        }

        System.out.println(ans);
    }
}