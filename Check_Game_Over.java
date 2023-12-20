import java.util.Arrays;

public class Check_Game_Over {
    public static boolean checkGame(String[][] board) {
        String[][] endzustand = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "" } };

        return Arrays.deepEquals(board, endzustand);
    }
}