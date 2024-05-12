//package DxDy;

import java.util.*;

public class Main {
	public static int[] dx = {-1,0,1,0};
	public static int[] dy = {0,1,0,-1};
	
	public static boolean inRange (int x, int y, int n) {
		return (0 <= x && x < n && 0 <= y && y < n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] grid = new int[n][n];
		
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < n; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		
		int answer = 0;
		
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int count = 0;
				
				for(int k = 0; k < 4; k++) { //0~3 까지 동서남북 카운트
					int ni = i + dx[k];
					int nj = j + dy[k];
					
					if(inRange(ni,nj,n) && grid[ni][nj] == 1) {
						count ++;
					}
				}
				
				if(count >=3) answer ++;
				
			}
		}
		
		System.out.println(answer);
	}
}