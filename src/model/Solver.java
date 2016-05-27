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
        if (Math.sqrt((double)puzzle.length)%1==0) {
            startPuzzle = puzzle;
            puzzleLength = puzzle.length;
            progress = puzzle;
            isSolved = false;
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
