/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        //to store parent of each
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode curr = q.poll();
            if(curr.left != null)
            {
                parent.put(curr.left, curr);
                q.offer(curr.left);
            }
            if(curr.right != null)
            {
                parent.put(curr.right, curr);
                q.offer(curr.right);
            }
        }
        Set<TreeNode> vis = new HashSet<>();
        q.offer(target);
        vis.add(target);
        int d = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            if(d == k)
                break;
            d++;
            for(int i = 0; i < size; i++)
            {
                TreeNode curr = q.poll();
                if(curr.left != null && !vis.contains(curr.left))
                {
                    q.offer(curr.left);
                    vis.add(curr.left);
                }
                if(curr.right != null && !vis.contains(curr.right))
                {
                    q.offer(curr.right);
                    vis.add(curr.right);
                }
                if(parent.containsKey(curr) && !vis.contains(parent.get(curr)))
                {
                    q.offer(parent.get(curr));
                    vis.add(parent.get(curr));
                }
            }
        }
        List<Integer> list = new LinkedList<>();
        while(!q.isEmpty())
        {
            list.add(q.poll().val);
        }
        return list;
    }
}