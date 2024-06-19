//package middle;
import java.util.Scanner;

public class Main {
	public static int fibonacciCount(int n) {
		if(n == 1) {
			return 1;
		}else if(n == 2) {
			return 1;
		}
		
		return fibonacciCount(n-1) + fibonacciCount(n-2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = fibonacciCount(n);
		System.out.println(answer);
		
	}
}