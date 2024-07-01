//package study.codetree.mid.sort.instance;

import java.util.Scanner;
import java.util.Arrays;

class People {
    String name;
    String streetNumber;
    String city;

    public People() {
        this.name = "";
        this.streetNumber = "";
        this.city = "";
    }

    public People(String name, String streetNumber, String city) {
        this.name = name;
        this.streetNumber = streetNumber;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peopleCount = sc.nextInt(); //사람 수
        People[] peoples = new People[peopleCount];
        for (int i = 0; i < peopleCount; i++) {
            peoples[i] = new People(); //객체 초기화
            peoples[i].name = sc.next();
            peoples[i].streetNumber = sc.next();
            peoples[i].city = sc.next();
        }

        String[] name = new String[peopleCount];
        for (int i = 0; i < peopleCount; i++) {
            name[i] = peoples[i].name;
        }

        Arrays.sort(name);
        int index = 0;
        for (int i = 0; i < peopleCount; i++) {
            if (peoples[i].name.equals(name[peopleCount-1])) {
                index = i;
            }
        }

        System.out.println("name " + peoples[index].name);
        System.out.println("addr " + peoples[index].streetNumber);
        System.out.println("city " + peoples[index].city);
    }
}