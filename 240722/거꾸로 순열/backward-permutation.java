import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        arr = new int[n];
        used = new boolean[n + 1];
        
        generatePermutation(0);
    }
    
    static void generatePermutation(int index) {
        if (index == n) {
            printPermutation();
            return;
        }
        
        for (int i = n; i >= 1; i--) {
            if (!used[i]) {
                arr[index] = i;
                used[i] = true;
                generatePermutation(index + 1);
                used[i] = false;
            }
        }
    }
    
    static void printPermutation() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}