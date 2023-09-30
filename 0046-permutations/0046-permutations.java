class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] taken = new boolean[nums.length];
        permutation(nums, taken, list, ans);
        return ans;
    }
    
    public void permutation(int[] nums, boolean[] taken, List<Integer> list, List<List<Integer>> ans){
        if(list.size() == nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            if(!taken[i])
            {
                taken[i] = true;
                list.add(nums[i]);
                permutation(nums, taken, list, ans);
                list.remove(list.size()-1);
                taken[i] = false;
            }
        }
    }
}