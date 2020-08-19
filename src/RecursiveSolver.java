import java.io.*;

public class RecursiveSolver extends SudokuSolver {
    private final Board board;

    public RecursiveSolver(String filePath) throws IOException {
        this.board = new Board(filePath);
    }

    public Board solve(Board board) {
        if (board.isSolved()) {
            return board;
        } else {
            for (Board neighbors : board.getNeighbors()) {
                Board solution = solve(neighbors);
                if (solution != null) {
                    return solution;
                }
            }
        }
        return null;
    }

    public Board solve() {
        return solve(board);
    }


}