class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        if(nums1[l1-1] > nums2[0])
            return 0;
        int ans = 0;
        while(i < l1 && j < l2)
        {
            if(nums1[i] > nums2[j])
                i++;
            else
            {
                ans = Math.max(ans, j-i);
                j++;
            }
        }
        return ans;
    }
}