/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode T, TreeNode S) {
        if(T == null)
            return false;
        if(helper(T, S))
            return true;
        
        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }
    
    public boolean helper(TreeNode T, TreeNode S){
        if(T == null && S == null)
            return true;
        if(T == null || S == null)
            return false;
        
        if(T.val != S.val)
            return false;
        
        return helper(T.left, S.left) && helper(T.right, S.right);
    }
}