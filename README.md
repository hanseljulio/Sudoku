# Sudoku
Sudoku with Iterative and Recursive Solver
Created May 20th, 2019

-------------------------------------------------------------------------------

## Overview
This is a sudoku, created with lists, abstract classes, interfaces, and polymorphism.
Some Java 7 included to make sure the program runs better.

-------------------------------------------------------------------------------

### Classes
1. Board.java - creates board, checks for validity
 * This class creates the sudoku board and checks for its validity
 * Constructors:
   * Board(String filePath) throws IOException
     * This function will read the given file and set the given field to the board
   * Board(List<List<Integer>> board)
     * This function will create a new board from the private field
 * Functions:
   * getBoard()
     * This function will return the board as a Integer 2D list
   * toString()
     * This function will return the board as a string
   * getNumBlanks()
     * This function will return how many blanks are in the board
   * isValid()
     * This function will check for whether the placements in the sudoku are valid or not
   * isSolved()
     * This function will check for whether the sudoku has been solved or not
   * getNeighbors()
     * This function will check for the board's neighbors, and if it is valid, it will add it to the board
   * setCells(int row, int col, int num)
     * This function will set get the row number and set the number at the given column
  

2. BoardReader.java - interface
 * This class serves as the interface for SDK and SS BoardReader


3. BoardReaderFactory.java
 * This class checks for the file type, whether it is .sdk or .ss
 * Function: getReader(String filePath)
   * This function directs .sdk files to SdkBoardReader() and .ss files to SsBoardReader()


4. IterativeSolver.java
 * This class solves the sudoku iteratively, is an extension of SudokuSolver
 * Constructor: IterativeSolver(String filePath) throws IOException
   * This constructor takes in the given file and creates a board with it
 * Functions:
  * solve()
    * This function is a recursive function for solve(Board board)
  * solve(Board board)
    * This function solves the board iteratively after taking in a board

5. RecursiveSolver.java
 * This class solves the sudoku recursively, is an extension of SudokuSolver
 * Constructor: RecursiveSolver(String filePath) throws IOException
   * This constructor takes in the given file and creates a board with it
 * Functions:
  * solve()
    * This function is a recursive function for solve(Board board)
  * solve(Board board)
    * This function solves the board recursively after taking in a board

6. SdkBoardReader.java
 * This class solves a sudoku that has a file type of sdk, implements BoardReader
 * Function: parseBoard(String filePath)
   * This function reads in sdk files to be later passed on to Board


7. SsBoardReader.java
 * This class solves a sudoku that has a file type of ss, implements BoardReader
 * Function: parseBoard(String filePath)
   * This function reads in sdk files to be later passed on to Board


8. SudokuSolver.java
 * This abstract class handles the solve function for the iterative/recursive solvers


9. SudokuSolverMain.java
 * Main class for the program driver
   



