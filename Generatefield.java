public class Generatefield {
    public static void main(String[] args) {

        String[][] board = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "" }, };

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                String s = String.valueOf(i);
                board[i][j] = s + j;
            }
        }
        for (String[] a : board) {
            for (String i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
    }
}