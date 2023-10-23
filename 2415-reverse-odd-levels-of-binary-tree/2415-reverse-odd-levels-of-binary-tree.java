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
        q.offer(root);
        int l = 0;
        while(!q.isEmpty()) {
            int count = q.size();
            Queue<TreeNode> temp = new LinkedList<>();
            Stack<Integer> stack = new Stack<>();
            for(int i = 1; i <= count; i++){
                TreeNode node = q.poll();
                if(l % 2 == 1){
                    temp.offer(node);
                    stack.push(node.val);
                }
                if(node.left != null)
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);
            }
            if(l % 2 == 1){
                while(!temp.isEmpty()){
                    TreeNode node = temp.poll();
                    node.val = stack.pop();
                }
            }
            l++;
        }
        return root;
    }
}