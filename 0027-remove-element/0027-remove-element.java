class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0, j = n;
        while(i < j)
        {
            if(nums[i] == val)
            {
                if(j < n && nums[j] != val)
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
                else
                    j--;
            }
            else
                i++;
        }
        while(j >= 0 && j < n && nums[j] == val)
            j--;
        return j>=0 ? j+1 : 0;
    }
}