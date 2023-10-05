class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++)
            ans.append(nums[i].charAt(i) == '1' ? '0' : '1');
        return ans.toString();
    }
}