//package low;

import java.util.Scanner;

public class Main {
	public static boolean isLeapYear(int y) {
		if(y % 4 == 0) {
			if(y % 100 == 0 && y % 400 != 0) {
				return false;
			}else {
				return true;
			}
		}else {
			return false;
		}
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int y = sc.nextInt();
        
        if(isLeapYear(y)) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }
    }
}