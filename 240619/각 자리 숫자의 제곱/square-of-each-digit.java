//package middle;
import java.util.Scanner;

public class Main {
	public static int dotSum(int n) {
		if(n < 10) {
			return n*n;
		}
		int decimalDot = (n%10) * (n%10);
		
		return dotSum(n/10) +decimalDot;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(dotSum(n));
	}
}