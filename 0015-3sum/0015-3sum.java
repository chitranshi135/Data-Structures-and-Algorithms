class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int i, j, k;
        for(i = 0; i < nums.length-2; i++)
        {
            j = i+1;
            k = nums.length-1;
            while(j < k)
            {
                int s = nums[i]+nums[j]+nums[k];
                if(s == 0)
                {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j+1 <= k && nums[j] == nums[j+1])
                        j++;
                    j++;
                    k--;
                }
                else if(s > 0)
                    k--;
                else
                    j++;
            }
            while (i+1 < nums.length && nums[i+1] == nums[i]) 
                i++;
        }
        return new ArrayList<>(list);
    }
}