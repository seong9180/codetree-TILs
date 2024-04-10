public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        int tmp1,tmp2 = 0;

        tmp1 = b;
        tmp2 = c;
        b = a;
        c = tmp1;
        a = tmp2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}