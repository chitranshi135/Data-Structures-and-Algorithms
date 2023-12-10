class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int count = 0;
        boolean flag = false;
        for(int i = 1; i < n-1; i++){
            if(nums[i] == nums[i-1] && flag)
                continue;
            
            int left = -1;
            int right = -1;
            
            for(int j = i-1; j >= 0; j--){
                if(nums[j] != nums[i]){
                    left = j;
                    break;
                }
            }
            for(int j = i+1; j < n; j++){
                if(nums[j] != nums[i]){
                    right = j;
                    break;
                }
            }
            
            if(left != -1 && right != -1 && ((nums[left] > nums[i] && nums[right] > nums[i]) || (nums[left] < nums[i] && nums[right] < nums[i]))){
                count++;
                flag = true;
            }
            else
                flag = false;
        }
        return count;
    }
}