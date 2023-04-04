class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Arrays.sort(nums1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->nums2[b]-nums2[a]);
        for(int i = 0; i < nums2.length; i++)
        {
            pq.add(i);
        }
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        int high = n-1;
        int low = 0;
        while(!pq.isEmpty())
        {
            int idx = pq.poll();
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