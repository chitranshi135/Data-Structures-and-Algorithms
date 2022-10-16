class Solution {
    public int[] findOrder(int n, int[][] pre) {
        int[] order = new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
        
        //using bfs
        //if topological sort cannot be generated, means cycle is present
        int[] indegree = new int[n];
        for(int i = 0; i < pre.length; i++)
        {
            adj.get(pre[i][1]).add(pre[i][0]);
            indegree[pre[i][0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int x = 0; x < n ; x++)
        {
            if(indegree[x] == 0)
                q.add(x);
        }
        //no of vertices in topo sort
        int count = 0;
        while(!q.isEmpty())
        {
            int v = q.poll();
            order[count] = v;
            count++;
            for(int x : adj.get(v))
            {
                indegree[x]--;
                if(indegree[x] == 0)
                    q.add(x);
            }
        }
        if(count == n)
            return order;
        else
            return new int[] {};
    }
}