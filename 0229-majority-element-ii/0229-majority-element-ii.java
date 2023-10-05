class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        for(int x: map.keySet())
        {
            int val = map.get(x);
            if(val > n/3)
                ans.add(x);
        }
        return ans;
    }
}