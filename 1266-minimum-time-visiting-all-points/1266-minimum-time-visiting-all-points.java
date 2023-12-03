class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int i;
        int t = 0;
        for(i = 0; i < points.length-1; i++)
        {
            t += Math.max(Math.abs(points[i][0]-points[i+1][0]), Math.abs(points[i][1]-points[i+1][1]));
        }
        return t;
    }
}