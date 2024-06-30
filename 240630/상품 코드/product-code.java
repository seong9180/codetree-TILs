//package study.codetree.mid.sort.instance;

import java.util.Scanner;

class Product {
    String name;
    int code;

    public Product() {
        this.name = "";
        this.code = 0;
    }

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product1 = new Product();
        product1.name = sc.next();
        product1.code = sc.nextInt();

        Product product2 = new Product("codetree", 50);

        System.out.println("product " + product2.code + " is " + product2.name);
        System.out.println("product " + product1.code + " is " + product1.name);
    }
}