import java.util.*;

public class Main {
    static class Rectangle {
        int x1, y1, x2, y2;
        Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Rectangle a = new Rectangle(scanner.nextInt(), scanner.nextInt(), 
                                    scanner.nextInt(), scanner.nextInt());
        Rectangle b = new Rectangle(scanner.nextInt(), scanner.nextInt(), 
                                    scanner.nextInt(), scanner.nextInt());
        
        int area = calculateRemainingArea(a, b);
        System.out.println(area);
        
        scanner.close();
    }

    static int calculateRemainingArea(Rectangle a, Rectangle b) {
        List<Rectangle> remainingParts = new ArrayList<>();
        
        // 위쪽 부분
        if (a.y2 > b.y2) {
            remainingParts.add(new Rectangle(a.x1, Math.max(b.y2, a.y1), a.x2, a.y2));
        }
        
        // 아래쪽 부분
        if (a.y1 < b.y1) {
            remainingParts.add(new Rectangle(a.x1, a.y1, a.x2, Math.min(b.y1, a.y2)));
        }
        
        // 왼쪽 부분
        if (a.x1 < b.x1) {
            remainingParts.add(new Rectangle(a.x1, Math.max(a.y1, b.y1), 
                                             Math.min(b.x1, a.x2), Math.min(a.y2, b.y2)));
        }
        
        // 오른쪽 부분
        if (a.x2 > b.x2) {
            remainingParts.add(new Rectangle(Math.max(b.x2, a.x1), Math.max(a.y1, b.y1), 
                                             a.x2, Math.min(a.y2, b.y2)));
        }
        
        int totalArea = 0;
        for (Rectangle part : remainingParts) {
            totalArea += (part.x2 - part.x1) * (part.y2 - part.y1);
        }
        
        return totalArea;
    }
}