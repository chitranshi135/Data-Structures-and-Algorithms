class Solution {
    public int maxDepth(String s) {
        int open = 0;
        int maxDepth = 0;
        for(char ch: s.toCharArray()){
            if(ch == '(')
                open++;
            else if(ch == ')'){
                maxDepth = Math.max(maxDepth, open);
                open--;
            }
        }
        return maxDepth;
    }
}