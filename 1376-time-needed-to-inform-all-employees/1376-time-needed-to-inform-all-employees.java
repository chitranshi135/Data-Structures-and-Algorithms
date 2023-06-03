class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        for(int i = 0; i < n; i++)
        {
            if(manager[i] != -1)
            {
                graph.get(manager[i]).add(i);
            }
        }
        return dfs(headID, graph, informTime);
    }

    public int dfs(int i, List<List<Integer>> graph, int[] informTime)
    {
        int max = 0;
        for(int sub: graph.get(i))
        {
            max = Math.max(max, informTime[i]+dfs(sub, graph, informTime));
        }
        return max;
    }
}