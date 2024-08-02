import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] aSpeeds = new int[N];
        int[] aTimes = new int[N];
        for (int i = 0; i < N; i++) {
            aSpeeds[i] = sc.nextInt();
            aTimes[i] = sc.nextInt();
        }
        
        int[] bSpeeds = new int[M];
        int[] bTimes = new int[M];
        for (int i = 0; i < M; i++) {
            bSpeeds[i] = sc.nextInt();
            bTimes[i] = sc.nextInt();
        }
        
        int aPosition = 0;
        int bPosition = 0;
        int leadChanges = 0;
        int previousLead = 0; // 0: 동일, 1: A, -1: B
        
        int aIndex = 0, bIndex = 0;
        int aRemainingTime = aTimes[0];
        int bRemainingTime = bTimes[0];
        
        while (aIndex < N && bIndex < M) {
            int currentTime = Math.min(aRemainingTime, bRemainingTime);
            
            aPosition += aSpeeds[aIndex] * currentTime;
            bPosition += bSpeeds[bIndex] * currentTime;
            
            int currentLead;
            if (aPosition > bPosition) {
                currentLead = 1;
            } else if (bPosition > aPosition) {
                currentLead = -1;
            } else {
                currentLead = 0;
            }
            
            if (currentLead != previousLead && currentLead != 0) {
                leadChanges++;
                previousLead = currentLead;
            }
            
            aRemainingTime -= currentTime;
            bRemainingTime -= currentTime;
            
            if (aRemainingTime == 0) {
                aIndex++;
                if (aIndex < N) {
                    aRemainingTime = aTimes[aIndex];
                }
            }
            if (bRemainingTime == 0) {
                bIndex++;
                if (bIndex < M) {
                    bRemainingTime = bTimes[bIndex];
                }
            }
        }
        
        System.out.println(leadChanges);
    }
}