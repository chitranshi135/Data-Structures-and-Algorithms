class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length-1;
        int[] f = new int[n+1];
        for(int x : nums){
            if(x > n)
                return false;
            
            f[x]++;
            
            if(x < n && f[x] > 1)
                return false;
            
            if(x == n && f[x] > 2)
                return false;
        }
        return true;
    }
}