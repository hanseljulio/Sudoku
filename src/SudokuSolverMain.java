import java.io.*;
import java.util.*;

public class SudokuSolverMain {

    public static void main(String[] args) throws IOException {
        RecursiveSolver sdkSolver = new RecursiveSolver("src/SudokuBoard.sdk");
        RecursiveSolver sdkSolver2 = new RecursiveSolver("src/SudokuBoardCorrect.sdk");
        IterativeSolver sdkSolver22 = new IterativeSolver("src/KelsiesSudoku.sdk");

        // Recursive
        long t1 = System.nanoTime();
        System.out.println(sdkSolver2.solve());
        long t2 = System.nanoTime();
        System.out.println("Time: " + String.valueOf(t2 - t1));

        System.out.println();

        // Iterative
        long t3 = System.nanoTime();
        System.out.println(sdkSolver22.solve());
        long t4 = System.nanoTime();
        System.out.println("Time: " + String.valueOf(t4 - t3));

        // Recursive: 2041970 ms, Iterative: 979014 ms. The iterative solver runs faster in all tests.
        // I think it's because the iterative solution does not have to run the method over and over again like the recursive solution.


    }

}

   