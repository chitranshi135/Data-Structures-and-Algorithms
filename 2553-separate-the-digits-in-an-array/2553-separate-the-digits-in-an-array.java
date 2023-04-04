class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = nums.length-1; i >= 0; i--)
        {
            int curr = nums[i];
            while(curr > 0)
            {
                int r = curr % 10;
                list.add(0, r);
                curr = curr/10;
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);
        return ans;
    }
}