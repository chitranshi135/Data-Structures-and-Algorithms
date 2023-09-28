class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int n = nums.length;
        int[] a = new int[n];
        int c = 0;
        int d = n-1;
        int i;
        for(i = 0; i < n; i++)
        {
            if(nums[i] % 2 == 0)
                a[c++] = nums[i];
            else
                a[d--] = nums[i];
        }
        return a;
    }
}