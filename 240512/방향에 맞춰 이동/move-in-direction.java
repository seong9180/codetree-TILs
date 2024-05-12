//package DxDy;

import java.util.*;

public class Main {
	public static int[] dx = {0,1,0,-1};
	public static int[] dy = {1,0,-1,0};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		char[] direction = new char[n];
		int[] move_count = new int[n];
		
		int dir = 0;
		for(int i = 0 ; i < n; i++) {
			direction[i] = sc.next().charAt(0);
			move_count[i] = sc.nextInt();
		}
		
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < n; i++) {
			if(direction[i] == 'N') {
				dir = 0;
			}else if(direction[i] == 'E') {
				dir = 1;
			}else if(direction[i] == 'S') {
				dir = 2;
			}else {
				dir = 3;
			}
			
			x += move_count[i]*dx[dir];
			y += move_count[i]*dy[dir];
		}
		
		System.out.println(x + " " + y);
		
	}
}