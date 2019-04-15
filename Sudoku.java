//check for the sudoku correctness
/*public class Sudoku {

	public static void main(String[] args) {
		int[][] sudoku = {{8,1,2,9,7,4,3,6,5},{9,3,4,6,5,1,7,8,2},{7,6,5,8,2,3,9,4,1},{5,7,1,4,8,2,6,9,3},
		{2,8,9,3,6,5,4,1,7},{6,4,3,7,1,9,2,5,8},{1,9,6,5,3,7,8,2,4},{3,2,8,1,4,6,5,7,9},{4,5,7,2,9,8,1,3,6}};
		boolean isValidSudoku;
		isValidSudoku = validSudo(sudoku);
		if(isValidSudoku){
			System.out.println("The sudoku is a valid one");
		}
		else{
			System.out.println("The sudoku is not valid");
		}

	}
	
	static boolean validSudo(int a[][]){
		int subArraySum[];
		int subsum = 0;
		for(int i=0;i<a.length;i++){
			int rsum = 0;
			int csum = 0;
			for(int j=0;j<a.length;j++){
				rsum+=a[i][j];
				csum+=a[j][i];
			}
			if(rsum != 45 || csum != 45)
				return false;
		}
		
		
		return true;
	}

}
*/

//sudoku solving using backtracking
public class Sudoku {

 // dimension of input
 static int N = 9;

 // sample input
 static int grid[][] = { 
   { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, //
   { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, //
   { 0, 8, 7, 0, 0, 0, 0, 3, 1 }, //
   { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, //
   { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, //
   { 0, 5, 0, 0, 9, 0, 6, 0, 0 }, //
   { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, //
   { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, //
   { 0, 0, 5, 2, 0, 6, 3, 0, 0 } 
   };

 /**
  * Class to abstract the representation of a cell. Cell => (x, y)
  */
 static class Cell {

  int row, col;

  public Cell(int row, int col) {
   super();
   this.row = row;
   this.col = col;
  }

  @Override
  public String toString() {
   return "Cell [row=" + row + ", col=" + col + "]";
  }
 };

 /**
  * Utility function to check whether @param value is valid for @param cell
  */

 static boolean isValid(Cell cell, int value) {

  if (grid[cell.row][cell.col] != 0) {
   throw new RuntimeException(
     "Cannot call for cell which already has a value");
  }

  // if v present row, return false
  for (int c = 0; c < 9; c++) {
   if (grid[cell.row][c] == value)
    return false;
  }

  // if v present in col, return false
  for (int r = 0; r < 9; r++) {
   if (grid[r][cell.col] == value)
    return false;
  }

  // if v present in grid, return false

  // to get the grid we should calculate (x1,y1) (x2,y2)
  int x1 = 3 * (cell.row / 3);
  int y1 = 3 * (cell.col / 3);
  int x2 = x1 + 2;
  int y2 = y1 + 2;

  for (int x = x1; x <= x2; x++)
   for (int y = y1; y <= y2; y++)
    if (grid[x][y] == value)
     return false;

  // if value not present in row, col and bounding box, return true
  return true;
 }

 // simple function to get the next cell
 // read for yourself, very simple and straight forward
 static Cell getNextCell(Cell cur) {

  int row = cur.row;
  int col = cur.col;

  // next cell => col++
  col++;

  // if col > 8, then col = 0, row++
  // reached end of row, got to next row
  if (col > 8) {
   // goto next line
   col = 0;
   row++;
  }

  // reached end of matrix, return null
  if (row > 8)
   return null; // reached end

  Cell next = new Cell(row, col);
  return next;
 }

 // everything is put together here
 // very simple solution
 // must return true, if the soduku is solved, return false otherwise
 static boolean solve(Cell cur) {

  // if the cell is null, we have reached the end
  if (cur == null)
   return true;

  // if grid[cur] already has a value, there is nothing to solve here,
  // continue on to next cell
  if (grid[cur.row][cur.col] != 0) {
   // return whatever is being returned by solve(next)
   // i.e the state of soduku's solution is not being determined by
   // this cell, but by other cells
   return solve(getNextCell(cur));
  }

  // this is where each possible value is being assigned to the cell, and
  // checked if a solutions could be arrived at.
  
  // if grid[cur] doesn't have a value
  // try each possible value
  for (int i = 1; i <= 9; i++) {
   // check if valid, if valid, then update
   boolean valid = isValid(cur, i);

   if (!valid) // i not valid for this cell, try other values
    continue;

   // assign here
   grid[cur.row][cur.col] = i;

   // continue with next cell
   boolean solved = solve(getNextCell(cur));
   // if solved, return, else try other values
   if (solved)
    return true;
   else
    grid[cur.row][cur.col] = 0; // reset
   // continue with other possible values
  }

  // if you reach here, then no value from 1 - 9 for this cell can solve
  // return false
  return false;
 }

 public static void main(String[] args) {
  boolean solved = solve(new Cell(0, 0));
  if (!solved) {
   System.out.println("SUDOKU cannot be solved.");
   return;
  }
  System.out.println("SOLUTION\n");
  printGrid(grid);
 }

 // utility to print the grid
 static void printGrid(int grid[][]) {
  for (int row = 0; row < N; row++) {
   for (int col = 0; col < N; col++)
    System.out.print(grid[row][col] + "  ");
   System.out.println();
  }
 }
}