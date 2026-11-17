class Solution {
    static int ans;
    public int maxLength(List<String> arr) {
        ans = 0;
        StringBuilder sb = new StringBuilder("");
        helper(arr,sb,0);
        return ans;
    }
    static void helper(List<String> arr,StringBuilder sb,int i){
        if(i==arr.size()){
           int n = total(sb.toString());
           if(n==sb.length()){
            ans=Math.max(ans,sb.length());
           }
           return;
        }
        int oldLength = sb.length();

        sb.append(arr.get(i));
        helper(arr, sb, i + 1);
        sb.setLength(oldLength);

helper(arr, sb, i + 1);
    }
    static int total(String s){
        HashSet<Character> set = new HashSet<>();

for (char c : s.toCharArray()) {
    set.add(c);
}
return set.size();
    }
}