class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0)
            return list;
        int start = nums[0], end = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            int x = nums[i];
            if(x != end)
            {
                String str = "";
                if(start == nums[i-1])
                    str = Integer.toString(start);
                else
                    str = Integer.toString(start)+"->"+Integer.toString(nums[i-1]);
                
                list.add(str);
                start = x;
                end = x;
            }
            end++;
        }
        String str = "";
        if(start == nums[nums.length-1])
            str = Integer.toString(start);
        else
            str = Integer.toString(start)+"->"+Integer.toString(nums[nums.length-1]);
                
        list.add(str);
        return list;
    }
}