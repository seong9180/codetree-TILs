import java.util.*;

class Meeting implements Comparable<Meeting> {
    int start;
    int end;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting other) {
        if (this.end == other.end) {
            return this.start - other.start;
        }
        return this.end - other.end;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Meeting[] meetings = new Meeting[n];
        
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            meetings[i] = new Meeting(s, e);
        }
        
        // 종료 시간 기준으로 회의 정렬
        Arrays.sort(meetings);
        
        int count = 0;
        int lastEndTime = 0;
        
        for (Meeting meeting : meetings) {
            if (meeting.start >= lastEndTime) {
                count++;
                lastEndTime = meeting.end;
            }
        }
        
        System.out.println(count);
    }
}