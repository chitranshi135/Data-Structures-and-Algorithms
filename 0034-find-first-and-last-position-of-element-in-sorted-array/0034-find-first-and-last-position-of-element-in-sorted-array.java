class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int high = nums.length - 1;
        int low = 0;
        int first = -1;
        int last = -1;
        int mid;
        while(low <= high)
        {
            mid = low + (high-low)/2;
            if(nums[mid] == target)
            {
                first = mid;
                high = mid - 1;
            }
            else if(target < nums[mid])
                high = mid - 1;
            else
                low = mid+1;
        }
        ans[0] = first;
        low = 0;
        high = nums.length - 1;
        while(low <= high)
        {
            mid = low + (high-low)/2;
            if(nums[mid] == target)
            {
                last = mid;
                low = mid + 1;
            }
            else if(target < nums[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        ans[1] = last;
        return ans;
    }
}