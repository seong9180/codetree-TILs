import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Event> events = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            events.add(new Event(v, t, 'A'));
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            events.add(new Event(v, t, 'B'));
        }

        // Sort events by time
        Collections.sort(events);

        int aDistance = 0, bDistance = 0;
        int leadChanges = 0;
        int previousLead = 0; // 0: same, 1: A leading, 2: B leading

        for (Event event : events) {
            if (event.type == 'A') {
                aDistance += event.speed * event.time;
            } else {
                bDistance += event.speed * event.time;
            }

            int currentLead;
            if (aDistance > bDistance) {
                currentLead = 1;
            } else if (bDistance > aDistance) {
                currentLead = 2;
            } else {
                currentLead = 0;
            }

            if (currentLead != previousLead && currentLead != 0) {
                leadChanges++;
                previousLead = currentLead;
            }
        }

        System.out.println(leadChanges);
    }

    static class Event implements Comparable<Event> {
        int speed;
        int time;
        char type;

        Event(int speed, int time, char type) {
            this.speed = speed;
            this.time = time;
            this.type = type;
        }

        @Override
        public int compareTo(Event o) {
            return Integer.compare(this.time, o.time);
        }
    }
}