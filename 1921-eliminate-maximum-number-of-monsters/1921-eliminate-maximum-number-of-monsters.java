class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        double[] time = new double[n];
        for(int i = 0; i < n; i++)
        {
            time[i] = (1.0*dist[i])/speed[i];
        }
        Arrays.sort(time);
        double t = 0.0;
        int c = 0;
        for(int i = 0; i < n; i++)
        {
            if(t < time[i])
            {
                c++;
                t += 1;
            }
            else
                return c;
        }
        return c;
    }
}