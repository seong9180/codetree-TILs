import java.util.Scanner;

public class Main {
    static class Rectangle {
        int x1, y1, x2, y2;
        Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
        }
        int area() {
            return (x2 - x1) * (y2 - y1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Rectangle a = new Rectangle(scanner.nextInt(), scanner.nextInt(), 
                                    scanner.nextInt(), scanner.nextInt());
        Rectangle b = new Rectangle(scanner.nextInt(), scanner.nextInt(), 
                                    scanner.nextInt(), scanner.nextInt());
        
        int remainingArea = calculateRemainingArea(a, b);
        System.out.println(remainingArea);
        
        scanner.close();
    }

    static int calculateRemainingArea(Rectangle a, Rectangle b) {
        // 겹치는 영역 계산
        int overlapX1 = Math.max(a.x1, b.x1);
        int overlapY1 = Math.max(a.y1, b.y1);
        int overlapX2 = Math.min(a.x2, b.x2);
        int overlapY2 = Math.min(a.y2, b.y2);

        // 겹치는 영역의 넓이 계산
        int overlapArea = 0;
        if (overlapX1 < overlapX2 && overlapY1 < overlapY2) {
            overlapArea = (overlapX2 - overlapX1) * (overlapY2 - overlapY1);
        }

        // 남은 영역의 넓이 계산
        int remainingArea = a.area() - overlapArea;

        return remainingArea;
    }
}