import java.util.Scanner;

class CheckSudokuSolution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] sudoku = new int[9][9];
        System.out.println("Enter Sudoku solution:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = s.nextInt();
            }
        }

        System.out.println(isValidSudoku(sudoku) ? "Solution is valid" : "Solution is invalid");
        s.close();
    }

    public static boolean isValidSudoku(int[][] sudoku) {
        return validateRows(sudoku) && validateColumns(sudoku) && validateSubgrids(sudoku);
    }

    private static boolean validateRows(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[9];
            for (int j = 0; j < 9; j++) {
                int num = sudoku[i][j];
                if (num < 1 || num > 9 || seen[num - 1]) {
                    return false;
                }
                seen[num - 1] = true;
            }
        }
        return true;
    }

    private static boolean validateColumns(int[][] sudoku) {
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[9];
            for (int i = 0; i < 9; i++) {
                int num = sudoku[i][j];
                if (num < 1 || num > 9 || seen[num - 1]) {
                    return false;
                }
                seen[num - 1] = true;
            }
        }
        return true;
    }

    private static boolean validateSubgrids(int[][] sudoku) {
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                if (!validateSubgrid(sudoku, row, col)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean validateSubgrid(int[][] sudoku, int startRow, int startCol) {
        boolean[] seen = new boolean[9];
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                int num = sudoku[i][j];
                if (num < 1 || num > 9 || seen[num - 1]) {
                    return false;
                }
                seen[num - 1] = true;
            }
        }
        return true;
    }
}
