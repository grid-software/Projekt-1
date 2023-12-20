public class Generatefield {
    public static void main(String[] args) {

        String[][] board = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "" }, };

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
        }
        System.out.println("\n");
    }
}
