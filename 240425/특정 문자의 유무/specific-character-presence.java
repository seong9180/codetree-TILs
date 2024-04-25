import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        /*
        if(str.substring(0,str.length()).equals("ee")){
            System.out.print("YES ");
        }else{
            System.out.print("NO ");
        }

        if(str.substring(0,str.length()).equals("ab")){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
        */
        boolean exist = false;

        if(str.contains("ee")){
            exist = true;
        }

        if(exist == true){
            System.out.print("Yes ");
        }else{
            System.out.print("No ");
        }

        if(str.contains("ab")){
            exist = true;
        }else{
            exist = false;
        }

        if(exist == true){
            System.out.print("Yes ");
        }else{
            System.out.print("No ");
        }

        
        
    }
}