
public class NQueensProblem {
	
	final int n = 4;

	public static void main(String[] args) {
		NQueensProblem queen = new NQueensProblem();
		queen.solveNQ();
	}
	
	void printSolution(int board[][]){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(" "+board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	boolean solveNQ(){
		int board[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		if(solveNQUtil(board, 0) == false){
			System.out.println("Solution does not exist");
			return false;
		}
		printSolution(board);
		return true;
		
	}
	
	boolean isSafe(int board[][],int row,int col){
		int i,j;
		//check this row on left side
		for(i=0;i<col;i++){
			if(board[row][i] == 1)
				return false;
		}
		//check upper diagonal on left side
		for(i=row,j=col;i>=0 && j>=0;i--,j--){
			if(board[i][j] == 1)
				return false;
		}
		//check lower diagonal on left side
		for(i=row,j=col;j>=0 && i<n;i++,j--){
			if(board[i][j] == 1)
				return false;
		}
		return true;
	}
	
	boolean solveNQUtil(int board[][],int col){
		if(col >= n){
			return true;
		}
		for(int i=0;i<n;i++){
			if(isSafe(board,i,col)){
				board[i][col] = 1;
				if(solveNQUtil(board,col+1)){
					return true;
				}
				board[i][col] = 0;
			}
		}
		return false;
	}
}

