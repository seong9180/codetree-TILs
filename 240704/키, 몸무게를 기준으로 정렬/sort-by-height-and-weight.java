//package study.codetree.mid.sort.instance;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student2 implements Comparable <Student2> {
    String name;
    int height;
    int weight;

    public Student2() {
        this.name = "";
        this.height = 0;
        this.weight = 0;
    }

    public Student2(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public int compareTo(Student2 student2) {
        if (this.height == student2.height) {
            return student2.weight - this.weight; //내림차순
        }
        return this.height - student2.height; //오름차순
    }

    public String toString() {
        return name + " " + height + " " + weight;
    }
}

public class Main {
    public static void main(String[] args) {
        //n 명, 이름, 키, 몸무게
        //키를 기준으로 오름차순
        //키가 동일 > 몸무게 기(더 큰 사람이 위로) : 내림차순

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student2[] s = new Student2[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            s[i] = new Student2(name, height, weight);
        }

        Arrays.sort(s);

        for (Student2 student2 : s) {
            System.out.println(student2);
        }
    }
}