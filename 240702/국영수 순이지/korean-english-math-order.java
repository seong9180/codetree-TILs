//package study.codetree.mid.sort.instance;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student1 implements Comparable<Student1> {
    String name;
    int kor = 0, eng = 0, math = 0;

    public Student1(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public Student1() {
        this.name = "";
        this.kor = 0;
        this.eng = 0;
        this.math = 0;
    }

    @Override
    public int compareTo(Student1 student1) {
        if (this.kor == student1.kor) {
            if (this.eng == student1.eng) {
                return student1.math - this.math;
            }
            return student1.eng - this.eng;
        }
        return student1.kor - this.kor;
    }
}

public class Maini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student1[] students = new Student1[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student1();
            students[i].name = sc.next();
            students[i].kor = sc.nextInt();
            students[i].eng = sc.nextInt();
            students[i].math = sc.nextInt();
        }

        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            System.out.println(students[i].name + " " + students[i].kor + " " + students[i].eng + " " + students[i].math);
        }

    }
}