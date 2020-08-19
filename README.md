# Sudoku
Sudoku with Iterative and Recursive Solver
Created May 20th, 2019

Uses lists, abstract classes, interfaces, polymorphism.
Some Java 7 included to make sure the program runs better.

- Accepts file with .sdk or .ss
- Place file in the same directory as program
- Inside the program, create new object (RecursiveSolver or IterativeSolver), with filePath = "src/File Name .sdk or .ss
- Run the program, and it will solve the sudoku.


- Board.java - creates board, checks for validity
- BoardReader.java - interface
- BoardReaderFactory - checks file, whether it is .sdk or .ss
- IterativeSolver.java - Solves sudoku iteratively
- RecursiveSolver.java - Solves sudoku recursively
- SdkBoardReader.java and SsBoardReader - .sdk and .ss sudoku solver
- SudokuSolver - abstract class for solve method
- SudokuSolverMain - Main file

All .sdk file are the sudoku files.
