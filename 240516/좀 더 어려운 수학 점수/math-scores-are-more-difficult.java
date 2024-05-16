//package low;

import java.util.Scanner;

public class Main {
    
    public static int max = 2;
    public static int[] eng = new int[max];
    public static int[] math = new int[max];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //구조체로도 만들어보기
        for(int i = 0 ; i < 2; i++) {
        	math[i] = sc.nextInt();
        	eng[i] = sc.nextInt();
        }
        
        if(math[0] > math[1]) {
        	System.out.println("A");
        }else if(math[0] == math[1]) {
        	if(eng[0] > eng[1]) {
        		System.out.println("A");
        	}else {
        		System.out.println("B");
        	}
        }else {
        	System.out.println("B");
        }
    }
}