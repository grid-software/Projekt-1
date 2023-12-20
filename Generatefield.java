public class Generatefield {
    public static void main(String[] args) {

        int max = 8;
        int min = 1;
        int range = max - min + 1;

        String[][] board = { { "1", "4", "7" }, { "2", "6", "5" }, { "3", "8", "" }, };

        // for (int i = 0; i < 8; i++) {
        // int rand = (int) (Math.random() * range) + min;
        // String rands = String.valueOf(rand);
        // for (int j = 0; j < board.length; j++) {

        // }
        // }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                System.out.print(board[i][j] + "\t");
            }

            System.out.println("\n");
        }
    }
}
