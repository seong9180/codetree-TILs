import java.util.*;

public class Main {
    static class Jewel implements Comparable<Jewel> {
        double weight;
        double value;
        double valuePerWeight;

        Jewel(double weight, double value) {
            this.weight = weight;
            this.value = value;
            this.valuePerWeight = value / weight;
        }

        @Override
        public int compareTo(Jewel other) {
            // valuePerWeight가 큰 순서대로 정렬
            return Double.compare(other.valuePerWeight, this.valuePerWeight);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 보석의 개수
        int m = scanner.nextInt(); // 가방의 최대 무게

        Jewel[] jewels = new Jewel[n];

        for (int i = 0; i < n; i++) {
            double weight = scanner.nextDouble();
            double value = scanner.nextDouble();
            jewels[i] = new Jewel(weight, value);
        }

        // 보석을 무게당 가치가 높은 순서대로 정렬
        Arrays.sort(jewels);

        double totalValue = 0.0;
        int remainingCapacity = m;

        for (Jewel jewel : jewels) {
            if (remainingCapacity == 0) {
                break;
            }

            if (remainingCapacity >= jewel.weight) {
                // 보석을 전부 담을 수 있는 경우
                totalValue += jewel.value;
                remainingCapacity -= jewel.weight;
            } else {
                // 보석을 부분적으로 담아야 하는 경우
                totalValue += jewel.valuePerWeight * remainingCapacity;
                remainingCapacity = 0; // 가방이 꽉 찼으므로 종료
            }
        }

        // 결과를 소숫점 셋째 자리에서 반올림하여 출력
        System.out.printf("%.3f", totalValue);
    }
}