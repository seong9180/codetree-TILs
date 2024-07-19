import java.io.*;
import java.util.*;

class Person implements Comparable<Person> {
    int id, arrivalTime, stayTime;

    Person(int id, int arrivalTime, int stayTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.stayTime = stayTime;
    }

    @Override
    public int compareTo(Person other) {
        return this.arrivalTime - other.arrivalTime;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Person> arrivals = new PriorityQueue<>();
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arrivalTime = Integer.parseInt(st.nextToken());
            int stayTime = Integer.parseInt(st.nextToken());
            arrivals.offer(new Person(i, arrivalTime, stayTime));
        }

        PriorityQueue<Person> waiting = new PriorityQueue<>((a, b) -> a.id - b.id);
        int currentTime = 0;
        int maxWaitTime = 0;

        while (!arrivals.isEmpty() || !waiting.isEmpty()) {
            while (!arrivals.isEmpty() && arrivals.peek().arrivalTime <= currentTime) {
                waiting.offer(arrivals.poll());
            }

            if (waiting.isEmpty() && !arrivals.isEmpty()) {
                currentTime = arrivals.peek().arrivalTime;
                continue;
            }

            Person current = waiting.poll();
            int waitTime = Math.max(0, currentTime - current.arrivalTime);
            maxWaitTime = Math.max(maxWaitTime, waitTime);

            currentTime += current.stayTime;
        }

        System.out.println(maxWaitTime);
    }
}