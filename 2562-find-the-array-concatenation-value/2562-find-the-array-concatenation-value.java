class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long tot = 0L;
        int n = nums.length;
        int i = 0, j = n-1;
        while(i < j)
        {
            String s = String.valueOf(nums[i++])+String.valueOf(nums[j--]);
            tot += Integer.valueOf(s);
        }
        if(i == j)
            tot += nums[i];
        return tot;
    }
}