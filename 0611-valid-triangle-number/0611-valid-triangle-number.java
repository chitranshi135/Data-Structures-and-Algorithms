class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        //we find pairs such that i < j < k
        int count = 0;
        for (int k = 2; k < n; k++) {
            int i = 0, j = k-1;
            while(i < j)
            {
                if(nums[i]+nums[j] > nums[k])
                {
                    //fixed vale of j
                    //range of i can be from i to j-1
                    count += j-i;
                    j--;
                }
                else
                {
                    i++;
                }
            }
        }
        return count;
    }
}