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
		
		int n = sc.nextInt(); // n*n 격자 
		int t = sc.nextInt(); // 이동 time
		
		int r = sc.nextInt(); // 구슬의 초기 x
		int c = sc.nextInt(); // 구슬의 초기 y
		char d = sc.next().charAt(0); // 구슬의 초기 dir
		
		int dir = 0;
		
		if(d == 'U') {
			dir = 0;
		}else if(d == 'R') {
			dir = 1;
		}else if(d == 'D') {
			dir = 2;
		}else { // 'L'
			dir = 3;
		}
		
		//격자의 좌표 시작이 (1,1) 이기 때문에 배열과 맞추기 위해 조정
		int x = r - 1;
		int y = c - 1;
		
		for(int i = 0 ; i < t; i++) {
			int nx = x + dx[dir];
			int ny = y + dy[dir];
			
			if(!inRange(nx,ny,n)) { //예상 이동 위치가 격자 범위 밖이라면
				dir = (dir + 1) % 4;
				dir = (dir + 1) % 4;
				
				//180도 회전 후 continue : 방향 변경에도 1t 가 소요되기 때문
				continue;
			}else {
				x += dx[dir];
				y += dy[dir];
			}
		}
		
		System.out.println((x+1) + " " + (y+1));
		
		
	}
}