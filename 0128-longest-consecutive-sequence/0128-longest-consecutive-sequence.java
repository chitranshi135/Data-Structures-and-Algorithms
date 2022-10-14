class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums)
        {
            set.add(n);
        }
        int max = 0;
        for(int x : set)
        {
            if(!set.contains(x-1))
            {
                int curr = x;
                int l = 1;
                while(set.contains(curr+1))
                {
                    curr = curr+1;
                    l++;
                }
                max = Math.max(max, l);
            }
        }
        return max;
    }
}