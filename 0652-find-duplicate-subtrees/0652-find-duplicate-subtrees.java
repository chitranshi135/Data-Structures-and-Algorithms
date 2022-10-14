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
        Map<String, List<TreeNode>> map = new HashMap<String, List<TreeNode>>();
        List<TreeNode> list = new LinkedList<>();
        helper(root, map);
        for (List<TreeNode> group : map.values())
        {
            if(group.size() > 1)
                list.add(group.get(0));
        }
        return list;
    }
    public String helper(TreeNode root,  Map<String, List<TreeNode>> map)
    {
        if(root == null)
            return "N";
        String sub = "";
        String leftStr = helper(root.left, map);
        String rightStr = helper(root.right, map);
        sub = "("+String.valueOf(root.val)+" "+leftStr+" "+rightStr+")";
        if(!map.containsKey(sub))
                map.put(sub, new ArrayList<TreeNode>());
            map.get(sub).add(root);
        return sub;
    }
}