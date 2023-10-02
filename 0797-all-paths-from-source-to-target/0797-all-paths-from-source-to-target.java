class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        solve(0, graph, list, ans);
        return ans;
    }
    
    public void solve(int node, int[][] graph, List<Integer> list, List<List<Integer>> ans) {
        if(node == graph.length-1)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int x : graph[node])
        {
            list.add(x);
            solve(x, graph, list, ans);
            list.remove(list.size()-1);
        }
    }
}