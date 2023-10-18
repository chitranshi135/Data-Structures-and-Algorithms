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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode[] parent = new TreeNode[2];
        int[] depth = {-1, -1};
        helper(root, x, y, parent, null, depth, -1);
        return (depth[0] == depth[1] && parent[0].val != parent[1].val) ? true : false;
    }
    
    public void helper(TreeNode root, int x, int y, TreeNode[] parent, TreeNode prev, int[] depth, int d) {
        if(root == null)
            return;
        
        if(root.val == x){
            parent[0] = prev;
            depth[0] = d;
        }
        
        if(root.val == y){
            parent[1] = prev;
            depth[1] = d;
        }
        
        if(depth[0] != -1 && depth[1] != -1)
            return;
        helper(root.left, x, y, parent, root, depth, d+1);
        helper(root.right, x, y, parent, root, depth, d+1);
    }
}