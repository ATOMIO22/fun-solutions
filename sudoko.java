/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[][] board = {
			{5, 3, 0, 0, 7, 0, 0, 0, 0},
			{6, 0, 0, 1, 9, 5, 0, 0, 0},
			{0, 9, 8, 0, 0, 0, 0, 6, 0},
			{8, 0, 0, 0, 6, 0, 0, 0, 3},
			{4, 0, 0, 8, 0, 3, 0, 0, 1},
			{7, 0, 0, 0, 2, 0, 0, 0, 6},
			{0, 6, 0, 0, 0, 0, 2, 8, 0},
			{0, 0, 0, 4, 1, 9, 0, 0, 5},
			{0, 0, 0, 0, 8, 0, 0, 7, 9}
		};

        boolean flsg =solve(board);
    if(flsg){
        
    
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
    }
    else{System.out.println("Not possible");}
	}
	static boolean solve(int[][] arr) {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(arr[i][j]==0) {
					for(int k=1; k<=9; k++) {
						if(valid(arr,i,j,k)) {
							arr[i][j] = k;
							if(solve(arr)) return true;
						arr[i][j]=0;
						    
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	static boolean valid(int[][] arr,int row,int col,int val) {
		for(int i=0; i<9; i++) {
			if(arr[row][i]==val || arr[i][col]==val) return false;
		}
		int starti =row-row%3;
		int startj  = col-col%3;
		for(int i=starti; i<starti+3; i++) {
			for(int j=startj; j<startj+3; j++) {
				if(arr[starti][startj]==val) return false;
			}
		}
		return true;
	}
}