import java.util.*;

public class Main {
    static class Segment implements Comparable<Segment> {
        int start, end;
        
        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
        
        @Override
        public int compareTo(Segment other) {
            return this.end - other.end;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        List<Segment> segments = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            segments.add(new Segment(start, end));
        }
        
        Collections.sort(segments);
        
        int count = 0;
        int lastEnd = -1;
        
        for (Segment segment : segments) {
            if (segment.start > lastEnd) {
                count++;
                lastEnd = segment.end;
            }
        }
        
        System.out.println(count);
        scanner.close();
    }
}