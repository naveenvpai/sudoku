/**
 * Created by Naveen on 5/27/16.
 */
public class Solver {
    private int[][] startPuzzle;
    private int     puzzleLength;
    private boolean isSolved;
    private int[][] progress;
    private int     numEmptySquares;

    /**
     * Initiate the solver with a puzzle
     * @param puzzle An n x n matrix such that n is a perfect square (eg. 4x4, 9x9, etc.)
     */
    public Solver(int[][] puzzle) {
        initiateWith(puzzle);
    }

    public void initiateWith(int[][] puzzle) throws IllegalArgumentException {
        if (Math.sqrt((double)puzzle.length)%1==0 && puzzle.length > 0) {
            startPuzzle = puzzle;
            puzzleLength = puzzle.length;
            progress = puzzle;
            isSolved = false;
            numEmptySquares = numEmptySquares(puzzle);
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    private int numFilledSquares(int[][] puzzle) {
        int numFilled = 0;
        for (int[] row : puzzle) {
            for (int square : row) {
                if (square != 0) numFilled++;
            }
        }
        return numFilled;
    }

    private int numEmptySquares(int[][] puzzle) {
        return puzzle.length*puzzle.length-numFilledSquares(puzzle);
    }

    private int numEmptySquaresInRow(int index) {
        int numEmpty = 0;
        int[] row = progress[index];
        for (int val : row) {
            if (val == 0) numEmpty++;
        }
        return numEmpty;
    }

    private int numEmptySquaresInColumn(int index) {
        int numEmpty = 0;
        for (int r = 0; r < progress.length; r++) {
            if (progress[r][index] == 0) numEmpty++;
        }
        return numEmpty;
    }

    /**
     * In sudoku, the n^2 by n^2 grid is separated into n^2 nxn squares
     * @param index starting at 0 and increasing first horizontally
     *              example: for n^2 = 9, the squares would be indexed:
     *              0 1 2
     *              3 4 5
     *              6 7 8
     * @return
     */
    private int numEmptySquaresInSquare(int index) {
        /*
        0 0 0 1 1 1 2 2 2
        0 0 0 1 1 1 2 2 2
        0 0 0 1 1 1 2 2 2
        3 3 3 4 4 4 5 5 5
        3 3 3 4 4 4 5 5 5
        3 3 3 4 4 4 5 5 5
        6 6 6 7 7 7 8 8 8
        6 6 6 7 7 7 8 8 8
        6 6 6 7 7 7 8 8 8
         */
        int squareLength = (int)Math.sqrt(puzzleLength);
        int startColumn  = (index%squareLength)*squareLength;
        int startRow     = (index-index%squareLength)*squareLength;
    }

    private void fillSquare(int r, int c, int val) {
        int initialVal = progress[r][c];
        progress[r][c] = val;
        if (initialVal == 0) numEmptySquares--;
        if (numEmptySquares == 0) isSolved = true;
    }

    public void nextStep() {

    }

    public void solvePuzzle() {

    }

    public boolean isSolved() {
        return isSolved;
    }

    public int[][] getStartPuzzle() {
        return startPuzzle;
    }

    public void setStartPuzzle(int[][] puzzle) {
        initiateWith(puzzle);
    }
}
