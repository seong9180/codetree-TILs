import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String s = sc.next();
            if(s.equals("END")){
                break;
            }else{
                char[] arr = s.toCharArray();
                int length = arr.length;
                for(int i = length-1; i >= 0; i--){
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }
        
    }
}