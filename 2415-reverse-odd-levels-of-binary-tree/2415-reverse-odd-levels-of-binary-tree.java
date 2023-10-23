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
    public TreeNode reverseOddLevels(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int cnt = 0;
    for (; q.size() > 0; cnt++) {
        int n = q.size();
        int[] level = new int[n];

        //get values of all nodes of current level
        for (int i = 0; i < n; ++i) {
            var node = q.remove();
            level[i] = node.val;
            q.add(node); //push back again
        }

        //put the values from in reverse in nodes if its odd level
        for (int i = n - 1; i >= 0; i--) {
            var node = q.remove();
            if (cnt == 0 || (cnt & 1) == 1) node.val = level[i];
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }
    return root;
}
}