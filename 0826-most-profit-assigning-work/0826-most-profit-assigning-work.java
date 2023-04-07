class Solution {
    public int maxProfitAssignment(int[] d, int[] profit, int[] worker) {
        int p = 0;
        int n = profit.length;
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++)
        {
            arr[i][0] = profit[i];
            arr[i][1] = d[i];
        }
        Arrays.sort(arr, (a,b)->b[0]-a[0]);
        for(int w : worker)
        {
            int i = 0;
            while(i < n)
            {
                if(arr[i][1] <= w)
                {
                    p += arr[i][0];
                    break;
                }
                i++;
            }
        }
        return p;
    }
}