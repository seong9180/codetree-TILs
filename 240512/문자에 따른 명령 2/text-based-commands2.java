//package DxDy;

import java.util.*;

public class Main {
	public static int[] dx = {0,1,0,-1};
	public static int[] dy = {1,0,-1,0};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next(); //입력받는 문자열
		int length = input.length();
		char[] order = new char[length];
		
		for(int i = 0 ; i < length; i++) {
			order[i] = input.charAt(i);
		}
		
		int x = 0;
		int y = 0;
		int dir = 0; //북쪽을 향하는 게 초기 설정
		
		for(int i = 0 ; i < length; i++) {
			if(order[i] == 'F') {
				x += dx[dir];
				y += dy[dir];
			}else if(order[i] == 'L') {
				//왼쪽으로 90도 방향 전환 = 반시계 방향 전환
				dir = (dir + 3) % 4;
			}else {
				//R 인 경우, 시계 방향 전환
				dir = (dir + 1) % 4;
			}
		}
		
		System.out.println(x + " " + y);
	
	}
}