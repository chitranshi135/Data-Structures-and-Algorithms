class Solution {
    public int minSizeSubarray(int[] nums, int target) {
        int n = nums.length;
        long tot = 0;
        for(int i = 0; i < n; i++)
            tot += nums[i];
        int ans = 0;
        if(target > (long)tot)
        {
            ans = (int)(target/tot) * n;
            target = (int)(target % tot);
        }
        if(target == 0)
            return ans;
        int i = 0, j = 0;
        int min = Integer.MAX_VALUE;
        int l = 2*n;
        long sum = 0;
        while(j < l)
        {
            while(j < l && sum + nums[j%n] <= target)
            {
                sum += nums[j%n];
                j++;
            }
            //System.out.println(i+" "+j+" "+sum);
            if(sum == target)
                min = Math.min(min, j-i);
            
            sum -= nums[i%n];
            i++; 
        }
        return (min == Integer.MAX_VALUE) ? -1 : min+ans;
    }
}