import java.io.*;
import java.util.*;

public class IterativeSolver extends SudokuSolver {
    private final Board board;

    public IterativeSolver(String filePath) throws IOException {
        this.board = new Board(filePath);
    }

    public Board solve(Board board) {
        Stack<Board> stack = new Stack<>();
        stack.push(board);

        while (!stack.empty()) {
            Board element = stack.pop();
            if (element.isSolved()) {
                return element;
            }
            for (Board neighbors : element.getNeighbors()) {
                stack.push(neighbors);
            }
        }
        return null;
    }

    public Board solve() {
        return solve(board);
    }

}