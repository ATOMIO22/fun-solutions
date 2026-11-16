/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//List<String> list;
		char[] arr= {'a','b','c'};
		StringBuilder sb = new StringBuilder("");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		helper(arr,sb,0,k);
	}
	//
	static void helper(char[] arr, StringBuilder sb, int n,int k) {
		if(sb.length()==k) {
			System.out.println(sb.toString());
			return;

		}

		for (int i = n; i < arr.length; i++) {
			sb.append(arr[i]);
			helper(arr, sb,i+1,k);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}