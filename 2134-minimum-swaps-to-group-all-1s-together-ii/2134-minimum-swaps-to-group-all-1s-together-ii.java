class Solution {
    public int minSwaps(int[] nums) {
        int tot = 0;
        for(int i = 0; i < nums.length; i++)
            tot += nums[i];
        int i = 0, j = 0, sum = 0;
        int n = nums.length, max = Integer.MIN_VALUE;
        if(tot == 0 || tot == 1 || tot == n)
            return 0;
        //we need to put all ones together
        //so we need to find a window of size tot
        //which has maximum number of ones
        while(j < 2*n)
        {
            sum += nums[j % n];
            if(j-i+1 < tot)
                j++;
            else
            {
                max = Math.max(max, sum);
                sum -= nums[i%n];
                i++;
                j++;
            }
        }
        return tot-max;
    }
}