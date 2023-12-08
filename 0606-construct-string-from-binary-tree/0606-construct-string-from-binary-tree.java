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
    public String tree2str(TreeNode root) {
        return dfs(root);
    }
    
    public String dfs(TreeNode root){
        if(root == null)
            return "";
        String curr = String.valueOf(root.val);
        if(root.left != null || root.right != null){
            String left = dfs(root.left);
            curr = curr + "(" + left + ")";
            String right = dfs(root.right);
            if(right.length() > 0)
                curr = curr + "(" + right + ")";
        }
        return curr;
    }
}