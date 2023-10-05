class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        String[] ans = new String[1];
        solve(n, nums, "", ans);
        return ans[0];
    }
    
    public boolean solve(int n, String[] nums, String curr, String[] ans) {
        if(n == 0){
            boolean res = false;
            for(String str : nums)
            {
                if(str.equals(curr))
                    res = true;
            }
            
            if(res == false)
            {
                ans[0] = curr;
                return true;
            }
            return false;
        }
        
        for(char c = '0'; c <= '1'; c++){
            if(solve(n-1, nums, curr+c, ans))
                return true;
        }
        return false;
    }
}