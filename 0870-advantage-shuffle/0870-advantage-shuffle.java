class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Arrays.sort(nums1);
        Integer[] pos = new Integer[n];
        for(int i = 0; i < nums2.length; i++)
        {
            pos[i] = i;
        }
        Arrays.sort(pos, (a,b)->nums2[b]-nums2[a]);
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        int high = n-1;
        int low = 0;
        for(int i = 0; i < n; i++)
        {
            int idx = pos[i];
            if(nums1[high] > nums2[idx])
            {
                ans[idx] = nums1[high];
                high--;
            }
            else
            {
                ans[idx] = nums1[low++];
            }
        }
        return ans;
    }
}