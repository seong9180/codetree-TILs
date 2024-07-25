import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] board = new String[3];
        for (int i = 0; i < 3; i++) {
            board[i] = scanner.next();
        }
        scanner.close();

        System.out.println(countTeamWins(board));
    }

    private static int countTeamWins(String[] board) {
        HashSet<String> teamWins = new HashSet<>();

        // Check rows
        for (int i = 0; i < 3; i++) {
            checkAndAddWin(board[i].charAt(0), board[i].charAt(1), board[i].charAt(2), teamWins);
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            checkAndAddWin(board[0].charAt(i), board[1].charAt(i), board[2].charAt(i), teamWins);
        }

        // Check diagonals
        checkAndAddWin(board[0].charAt(0), board[1].charAt(1), board[2].charAt(2), teamWins);
        checkAndAddWin(board[0].charAt(2), board[1].charAt(1), board[2].charAt(0), teamWins);

        return teamWins.size();
    }

    private static void checkAndAddWin(char a, char b, char c, HashSet<String> teamWins) {
        if (a != b && a != c && b != c) {
            // All three characters are different, so no team wins
            return;
        }

        // Check if there are exactly two different numbers
        HashSet<Character> uniqueChars = new HashSet<>();
        uniqueChars.add(a);
        uniqueChars.add(b);
        uniqueChars.add(c);

        if (uniqueChars.size() == 2) {
            // Convert to a sorted string to avoid duplicates (e.g., "12" and "21" should be considered the same)
            char[] arr = new char[]{a, b, c};
            java.util.Arrays.sort(arr);
            teamWins.add(new String(arr));
        }
    }
}