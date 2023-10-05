class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        String ans = "";
        for(int i = 0; i < n; i++)
            ans += (nums[i].charAt(i) == '1' ? '0' : '1');
        return ans;
    }
}