class Solution {
    int m,n;
    public int minimumEffortPath(int[][] heights) {
        m = heights.length;
        n = heights[0].length;
        int[][] eff = new int[m][n];
        for(int[] row : eff)
            Arrays.fill(row, Integer.MAX_VALUE);
        //no effort required to reach start position
        eff[0][0] = 0;
        PriorityQueue< int[] > pq = new PriorityQueue<>((a,b) -> a[2]-b[2]);
        //a[0] = x, a[1] = y, a[2] = effort
        pq.offer(new int[]{0, 0, 0});
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        while(!pq.isEmpty())
        {
            int[] curr = pq.poll();
            int x = curr[0], y = curr[1], e = curr[2];
            if(x == m-1 && y == n-1)
                return e;
            for(int[] d : dir)
            {
                int x1 = x + d[0], y1 = y + d[1];
                if(x1 < 0 || y1 < 0 || x1 == m || y1 == n)
                    continue;
                int maxEff = Math.max(e, Math.abs(heights[x][y] - heights[x1][y1]));
                if(maxEff < eff[x1][y1])
                {
                    eff[x1][y1] = maxEff;
                    pq.offer(new int[] {x1, y1, maxEff});
                }
            }
        }
        return 0;
    }
}