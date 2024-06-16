import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int n = 0; //n == count
        int length = a.length();
        for(int i = 0; i < length; i ++){
            a = shiftRight(a);
            //System.out.println(n + "번째 " +a);
            if(a.equals(b)){
                n ++;
                break;
            }
            n++;
        }
        
        if(n >= length){ // 불가능
            System.out.println(-1);
        }else{
            System.out.println(n);
        }
    }

    public static String shiftRight(String a){
        int length = a.length();
        return a.charAt(length-1) + a.substring(0,length-1);
    }
}