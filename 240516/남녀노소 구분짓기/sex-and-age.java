//package low;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        //남자는 0 여자는 1 19세이상 = 성인
        
        int sex = sc.nextInt();
        int age = sc.nextInt();
        
        if(sex == 0) {
        	if(age >= 19) {
        		System.out.println("MAN");
        	}else {
        		System.out.println("BOY");
        	}
        }else {
        	if(age >= 19) {
        		System.out.println("WOMEN");
        	}else {
        		System.out.println("GIRL");
        	}
        }
    }
}