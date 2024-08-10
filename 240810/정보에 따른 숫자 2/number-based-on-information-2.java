import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        List<Integer> sPositions = new ArrayList<>();
        List<Integer> nPositions = new ArrayList<>();
        
        for (int i = 0; i < T; i++) {
            String type = scanner.next();
            int position = scanner.nextInt();
            if (type.equals("S")) {
                sPositions.add(position);
            } else {
                nPositions.add(position);
            }
        }
        
        scanner.close();
        
        Collections.sort(sPositions);
        Collections.sort(nPositions);
        
        int specialCount = 0;
        for (int x = a; x <= b; x++) {
            int closestS = findClosest(sPositions, x);
            int closestN = findClosest(nPositions, x);
            
            if (Math.abs(x - closestS) <= Math.abs(x - closestN)) {
                specialCount++;
            }
        }
        
        System.out.println(specialCount);
    }
    
    private static int findClosest(List<Integer> positions, int x) {
        int left = 0;
        int right = positions.size() - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (positions.get(mid) == x) {
                return positions.get(mid);
            } else if (positions.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (right < 0) {
            return positions.get(0);
        } else if (left >= positions.size()) {
            return positions.get(positions.size() - 1);
        } else {
            int leftDiff = Math.abs(x - positions.get(right));
            int rightDiff = Math.abs(positions.get(left) - x);
            return leftDiff <= rightDiff ? positions.get(right) : positions.get(left);
        }
    }
}