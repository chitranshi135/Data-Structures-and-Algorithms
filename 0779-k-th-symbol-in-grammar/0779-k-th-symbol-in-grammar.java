class Solution {
    public int dfs(int n, int k, int root) {
        if(n == 1)
            return root;
        int tot = (int)Math.pow(2, n-1);
        
        //right half
        if(k > (tot/2)){
            int nextVal = (root == 0)? 1: 0;
            return dfs(n-1, k - (tot/2), nextVal);
        }
        //left half
        else {
            int nextVal = (root == 0)? 0: 1;
            return dfs(n-1, k, nextVal);
        }
    }
    
    public int kthGrammar(int n, int k) {
        return dfs(n, k, 0);
    }
}