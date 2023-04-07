class Solution {
    public int maxProfitAssignment(int[] d, int[] profit, int[] worker) {
        int p = 0;
        Arrays.sort(worker);
        int n = profit.length;
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++)
        {
            arr[i][0] = d[i];
            arr[i][1] = profit[i];
        }
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
        int i = 0;
        int max = 0;
        for(int w : worker)
        {
            while(i < n && arr[i][0] <= w)
            {
                max = Math.max(max,arr[i][1]);
                i++;
            }
            p += max;
        }
        return p;
    }
}