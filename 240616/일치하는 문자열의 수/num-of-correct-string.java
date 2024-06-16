import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a = sc.next();

        String[] str = new String[n];
        for(int i = 0 ; i < n ; i++){
            str[i] = sc.next();
        }
        
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(str[i].equals(a)){
                count++;
            }
        }

        System.out.println(count);
    }
}