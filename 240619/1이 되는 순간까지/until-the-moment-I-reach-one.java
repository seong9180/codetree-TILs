//package middle;
import java.util.Scanner;

public class Main {
	public static int count = 0;
	
	public static int continOperate(int n) {
		if(n == 1) {
			return 1;
		}
		
		if(n % 2 == 0) {
			count ++;
			return continOperate(n/2);
			
		}else {
			count++;
			return continOperate(n/3);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		continOperate(n);
		System.out.println(count);
	}
}