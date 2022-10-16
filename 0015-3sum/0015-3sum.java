class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> list = new HashSet<>();
        int i, j, k;
        for(i = 0; i < nums.length-2; i++)
        {
            j = i+1;
            k = nums.length-1;
            while(j < k)
            {
                int s = nums[i]+nums[j]+nums[k];
                if(s == 0)
                    list.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if(s > 0)
                    k--;
                else
                    j++;
            }
        }
        return new ArrayList<>(list);
    }
}