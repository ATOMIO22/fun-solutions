/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		char[][] arr= new char[n][n];
		for(int i=0; i<n; i++) {
			Arrays.fill(arr[i], '.');
		}
		List<char[][]> list = new ArrayList<>();
		solve(arr,n,list,0);

		for(char[][] a : list) {
			for(int i=0;i<n;i++){
			    for(int j=0;j<n;j++){
			        System.out.print(a[i][j]+" ");
			    }
			    System.out.println();
			}
			System.out.println();
		}
		System.out.println(list.size());
	}

	static void solve(char[][] arr,int n,List<char[][]> list,int row) {
		if(row==n) {
			char[][] copy = new char[n][n];
			for(int i=0; i<n; i++) {
				copy[i] = arr[i].clone();
			}

			list.add(copy);
			return;
		}
		for(int i=0; i<n; i++) {
			if(check(row,i,arr,n)) {
				arr[row][i]='Q';
				solve(arr,n,list,row+1);
				arr[row][i]='.';
			}
		}
	}
	static boolean check(int row,int col,char[][] arr,int n) {
		for(int i=0; i<=row; i++) {
			if(arr[i][col]=='Q') return false;
		}
		for(int i=row,j=col; i>=0 && j>=0; i--,j--) {
			if(arr[i][j]=='Q') return false;
		}
		for(int i=row,j=col; i>=0 &&j<n; j++,i--) {
			if(arr[i][j]=='Q') return false;
		}
		return true;
	}
}