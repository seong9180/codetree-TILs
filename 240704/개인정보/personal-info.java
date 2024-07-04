import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + height + " " + String.format("%.1f", weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] people = new Person[5];
        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            people[i] = new Person(name, height, weight);
        }

        // 이름순 정렬 (오름차순)
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.name.compareTo(b.name); // 이름 오름차순 정렬
            }
        });

        System.out.println("name");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println(); // 한 칸 띄우기

        // 키순 정렬 (내림차순)
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return Integer.compare(b.height, a.height); // 키 내림차순 정렬
            }
        });

        System.out.println("height");
        for (Person person : people) {
            System.out.println(person);
        }

        sc.close();
    }
}