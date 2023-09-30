class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(nums, 0, ans);
        return ans;
    }
    
    public void permutation(int[] nums, int idx, List<List<Integer>> ans){
        if(idx == nums.length)
        {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < nums.length; i++)
                list.add(nums[i]);
            ans.add(list);
            return;
        }
        
        for(int i = idx; i < nums.length; i++)
        {
            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
            
            permutation(nums, idx+1, ans);
            
            temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
        }
    }
}