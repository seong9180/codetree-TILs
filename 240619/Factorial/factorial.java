//package middle;
import java.util.Scanner;

public class Main {
	public static int factorialOperation (int n) {
		if(n == 0) {
			return 1;
		}else if(n == 1) {
			return 1;
		}
		
		return n * factorialOperation(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = factorialOperation(n);
		System.out.println(answer);
		
	}
}