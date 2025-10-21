import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sudoku_TheGame {
    static int[][] board = new int[9][9];

    public static void main(String[] args) throws FileNotFoundException {

        readBoardFromFile("src/sudoku.txt");
        Scanner input = new Scanner(System.in);

        while (true) {
            printBoard();


            System.out.print("\nShomare Satr Ra Vared Konid(1-9): ");
            int row = input.nextInt() - 1;
            System.out.print("Shomare Sotoon Ra Vared Konid(1-9): ");
            int col = input.nextInt() - 1;
            System.out.print("Adade Morede Nazar Ra Vared Konid(1-9): ");
            int num = input.nextInt();

            if (isValidMove(row, col, num)) {
                board[row][col] = num;
            } else {
                System.out.println("Harekat Eshtebahe! Dobare Emtehan Kon: ");
            }

            if (isBoardFull()) {
                if (isSolved()) {
                    printBoard();
                    System.out.println("Benazam Marami Bordi! :-)");
                    break;
                } else {
                    System.out.println("Jadval Por Shod Vali Eshtebahe!");
                    break;
                }
            }
        }

        input.close();
    }

    // Function Lanati Vase Khoondane File.
    public static void readBoardFromFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner reader = new Scanner(file);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (reader.hasNextInt()) {
                    board[i][j] = reader.nextInt();
                }
            }
        }

        reader.close();
    }

    // Chape Jadval
    public static void printBoard() {
        System.out.println("\n-------------------------");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) System.out.print("| ");
                System.out.print((board[i][j] == 0 ? "." : board[i][j]) + " ");
            }
            System.out.println("|");
            if (i % 3 == 2)
                System.out.println("-------------------------");
        }
    }

    // Barresi Harekate Dorost
    public static boolean isValidMove(int row, int col, int num) {
        if (board[row][col] != 0) return false;

        for (int j = 0; j < 9; j++)
            if (board[row][j] == num) return false;

        for (int i = 0; i < 9; i++)
            if (board[i][col] == num) return false;

        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++)
            for (int j = startCol; j < startCol + 3; j++)
                if (board[i][j] == num) return false;

        return true;
    }

    // Barresi Por Boodane Jadval
    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (board[i][j] == 0) return false;
        return true;
    }

    // Barresi Dorost Boodane Jadval
    public static boolean isSolved() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = board[i][j];
                board[i][j] = 0;
                if (!isValidMove(i, j, num)) {
                    board[i][j] = num;
                    return false;
                }
                board[i][j] = num;
            }
        }
        return true;
    }
}

