//package middle;
import java.util.Scanner;

public class Main {
	public static int makeSum(int n) {
		if(n == 1) {
			return 1;
		}
		
		int sum = 0;
		sum += makeSum(n-1);
		sum += n;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(makeSum(n));
	}

}