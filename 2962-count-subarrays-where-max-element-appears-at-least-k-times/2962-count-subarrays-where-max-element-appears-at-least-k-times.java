class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = -1;
        for(int x : nums){
            max = Math.max(max, x);
        }
        int n = nums.length;
        int i = 0;
        int count = 0;
        long res = 0;
        for(int j = 0; j < n; j++){
            if(nums[j] == max)
                count++;
            while(count >= k){
                if(nums[i] == max)
                    count--;
                i++;
            }
            //we can choose to start the subarray from any any point between 
            //0 and i-1
            //thus we have i subarrays
            res += (long)i;
        }
        return res;
    }
}