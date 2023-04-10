class Solution {
    public int calculate(int[] num1, int[] num2) {
        HashMap<Long, Integer> map = new HashMap<>();
        long n = num1.length,  m = num2.length, ans = 0;
        for(int i=0; i<n; i++)
            map.put((long)num1[i]*num1[i],map.getOrDefault((long)num1[i]*num1[i],0)+1);
        for(int j=0; j<m; j++)
        {
            for(int k=j+1; k<m; k++)
            {
                ans += (long)map.getOrDefault((long)num2[j]*num2[k],0);
            }
        }
        return (int)ans;
    }
    public int numTriplets(int[] nums1, int[] nums2) {
        return calculate(nums1,nums2) + calculate(nums2,nums1);
    }
}