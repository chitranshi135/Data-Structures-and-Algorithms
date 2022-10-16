class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        long t = target;
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        int x, i, j, k;
        for(x = 0; x < n-3; x++)
        {
            for(i = x+1; i < nums.length-2; i++)
            {
                j = i+1;
                k = nums.length-1;
                while(j < k)
                {
                    long s = (long)nums[x]+(long)nums[i]+(long)nums[j]+(long)nums[k];
                    if(s == t)
                    {
                        //System.out.println(x+" "+i+" "+j+" "+k);
                        list.add(Arrays.asList(nums[x],nums[i], nums[j], nums[k]));
                        while (j+1 <= k && nums[j] == nums[j+1])
                            j++;
                        j++;
                        k--;
                    }
                    else if(s > t)
                        k--;
                    else
                        j++;
                }
                while (i+1 < nums.length && nums[i+1] == nums[i]) 
                    i++;
            }
            while (x+1 < nums.length && nums[x+1] == nums[x]) 
                    x++;
        }
        return list;
    }
}