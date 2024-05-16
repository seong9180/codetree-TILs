//package low;

import java.util.Scanner;

public class Main {
    public static int middle_score;
    public static int final_score;
    
    public static int whichScore(int x, int y) {
    	if(x >= 90) {
    		if(95 <= y && y <= 100) {
    			return 10;
    		}else if(90 <= y) {
    			return 5;
    		}else {
    			return 0;
    		}
    	}
    	return 0; //중간고사 90점 미만 - 장학금 X
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        	
        middle_score = sc.nextInt();
        final_score = sc.nextInt();
        
        System.out.println(10000 * whichScore(middle_score, final_score));
        
    }
}