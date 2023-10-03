class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n = nums.size();
        int ans = n;
        int i = 0, j = (n+1)/2;
        while(i < j && j < n)
        {
            if(nums.get(i) < nums.get(j))
            {
                ans -= 2;
                i++;
            }
            j++;
        }
        return ans;
    }
}