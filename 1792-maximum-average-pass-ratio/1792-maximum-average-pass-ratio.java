class Solution {
    public double maxAverageRatio(int[][] c, int extra) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            // compare the increase ratio
            double fir = ((double) a[0] + 1)/(a[1] + 1) - ((double) a[0])/(a[1]);
            double sec = ((double) b[0] + 1)/(b[1] + 1) - ((double) b[0])/(b[1]);
            return Double.compare(sec, fir);
        });
        for(int i = 0; i < c.length; i++)
        {
            pq.add(c[i]);
        }
        while(extra > 0)
        {
            int[] curr = pq.poll();
            curr[0] += 1;
            curr[1] += 1;
            pq.add(curr);
            extra--;
        }
        double tot = 0;
        while(!pq.isEmpty())
        {
            int[] curr = pq.poll();
            tot += (1.0*curr[0])/curr[1];
        }
        return tot/c.length;
    }
}