class Solution {
    public int differenceOfSum(int[] nums) {
        int e = 0, d = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            int curr = nums[i];
            e += curr;
            while(curr > 0)
            {
                d += (curr % 10);
                curr = curr/10;
            }
        }
        return Math.abs(d-e);
    }
}