import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        String earliestRainDate = null;
        String earliestRainData = null;
        
        for (int i = 0; i < n; i++) {
            String data = scanner.nextLine();
            String[] parts = data.split(" ");
            String date = parts[0];
            String weather = parts[2];
            
            if (weather.equals("Rain")) {
                if (earliestRainDate == null || date.compareTo(earliestRainDate) < 0) {
                    earliestRainDate = date;
                    earliestRainData = data;
                }
            }
        }
        
        if (earliestRainData != null) {
            System.out.println(earliestRainData);
        }
        
        scanner.close();
    }
}