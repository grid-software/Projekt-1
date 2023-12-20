public class Display {
    public static void displayfield(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                System.out.print(board[i][j] + "\t");
            }

            System.out.println("\n");
        }
    }
}
