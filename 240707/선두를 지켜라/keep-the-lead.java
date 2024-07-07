import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/mnt/data/input.txt"));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Event> events = new ArrayList<>();

        int totalDuration = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            events.add(new Event(totalDuration, totalDuration + t, v, 'A'));
            totalDuration += t;
        }

        totalDuration = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            events.add(new Event(totalDuration, totalDuration + t, v, 'B'));
            totalDuration += t;
        }

        // Sort events by start time
        events.sort(Comparator.comparingInt(e -> e.startTime));

        int aDistance = 0, bDistance = 0;
        int leadChanges = 0;
        int previousLead = 0; // 0: same, 1: A leading, 2: B leading
        int currentTime = 0;

        for (Event event : events) {
            if (event.startTime > currentTime) {
                if (previousLead == 0) {
                    previousLead = aDistance > bDistance ? 1 : 2;
                }
            }

            currentTime = event.startTime;

            if (event.type == 'A') {
                aDistance += event.speed * (event.endTime - event.startTime);
            } else {
                bDistance += event.speed * (event.endTime - event.startTime);
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

            currentTime = event.endTime;
        }

        System.out.println(leadChanges);
    }

    static class Event {
        int startTime;
        int endTime;
        int speed;
        char type;

        Event(int startTime, int endTime, int speed, char type) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.speed = speed;
            this.type = type;
        }
    }
}