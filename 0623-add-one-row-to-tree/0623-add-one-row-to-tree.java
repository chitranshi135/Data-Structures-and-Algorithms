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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1)
        {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        helper(root, val, 1, depth);
        return root;
    }
    public void helper(TreeNode root, int val, int curr, int depth)
    {
        if(root == null)
            return;
        if(curr == depth-1)
        {
            TreeNode l = root.left;
            root.left = new TreeNode(val);
            root.left.left = l;
            TreeNode r = root.right;
            root.right = new TreeNode(val);
            root.right.right = r;
        }
        else
        {
            helper(root.left, val, curr+1, depth);
            helper(root.right, val, curr+1, depth);
        }
    }
}