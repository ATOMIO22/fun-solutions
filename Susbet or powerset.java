/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	//List<String> list;
    char[] arr={'a','b','c'};	
    StringBuilder sb = new StringBuilder("");
    helper(arr,sb,0);
	}
// 
static void helper(char[] arr, StringBuilder sb, int n) {
        System.out.println(sb.toString());

    for (int i = n; i < arr.length; i++) {
        sb.append(arr[i]);
        helper(arr, sb, i + 1);
        sb.deleteCharAt(sb.length() - 1);
    }
}
}