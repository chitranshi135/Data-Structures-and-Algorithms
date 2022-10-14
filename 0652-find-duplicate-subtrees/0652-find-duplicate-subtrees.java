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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<TreeNode> list = new LinkedList<>();
        helper(root, map, list);
        return list;
    }
    public String helper(TreeNode root,  Map<String, Integer> map, List<TreeNode> list)
    {
        if(root == null)
            return "N";
        String sub = "";
        String leftStr = helper(root.left, map, list);
        String rightStr = helper(root.right, map, list);
        sub = "("+String.valueOf(root.val)+" "+leftStr+" "+rightStr+")";
        map.put(sub, map.getOrDefault(sub, 0)+1);
        if(map.get(sub) == 2)
            list.add(root);
        return sub;
    }
}