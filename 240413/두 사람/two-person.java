import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a_age = sc.nextInt();
        
        //String 으로 받은 뒤 char 로 변환
        String s1 = sc.next();
		char a_sex = s1.charAt(0);

        int b_age = sc.nextInt();

        String s2 = sc.next();
		char b_sex = s2.charAt(0);

        if(a_sex == 'M'){
            if(a_age >=  19) System.out.println("1");
        }
        if(b_sex == 'M'){
            if(b_age >=  19) System.out.println("1");
        }
        if(a_age < 19 && b_age < 19){
            if(b_sex != 'M' && a_sex != 'M') System.out.println("0");
        }

    }   
}