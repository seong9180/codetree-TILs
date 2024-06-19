//package middle;
import java.util.Scanner;

public class Main {
	public static int evenOddSum(int n) {
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}
		
		if(n%2 == 0) {
			return n + evenOddSum(n-2);
		}else {
			return n + evenOddSum(n-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = evenOddSum(n);
		System.out.println(answer);
		
	}
}