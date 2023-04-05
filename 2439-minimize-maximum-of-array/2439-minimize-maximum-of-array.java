class Solution {
    public int minimizeArrayValue(int[] nums) {
        long ans = 0;
        long prevSum = 0;
        //in each iteration, whatever we reduce, is added to its prev
        //so the average value distrbuted remains same
        //Whenever we add a new value, the average will increase only
        //So, we find max previously and then the max after adding it, and take both's max
        for(int i = 0; i < nums.length; i++)
        {
            prevSum += nums[i];
            long max = (long)Math.ceil((1.0*prevSum)/(i+1));
            ans = Math.max(max, ans);
        }
        return (int)ans;
    }
}