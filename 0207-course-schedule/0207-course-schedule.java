class Solution {
    public boolean canFinish(int n, int[][] pre) {
        //using bfs
        //if topological sort cannot be generated, means cycle is present
        int[] indegree = new int[n];
        for(int i = 0; i < pre.length; i++)
        {
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
            count++;
            for(int i = 0; i < pre.length; i++)
            {
                if(pre[i][1] == v)
                {
                    indegree[pre[i][0]]--;
                    if(indegree[pre[i][0]] == 0)
                    {
                        q.add(pre[i][0]);
                    }
                }
            }
        }
        return count == n;
    }
}