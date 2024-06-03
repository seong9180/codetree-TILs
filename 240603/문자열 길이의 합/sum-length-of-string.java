import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        String[] string = new String[n];

        for(int i = 0 ; i < n ; i++){
            string[i] = sc.next();
            sum += string[i].length();
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            if(string[i].charAt(0) == 'a'){
                count ++;
            }
        }

        System.out.println(sum + " " + count);
    }
}