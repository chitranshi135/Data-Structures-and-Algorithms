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
        int i = n-1;
        while(!pq.isEmpty())
        {
            if(nums1[i] > nums2[pq.peek()])
            {
                ans[pq.peek()] = nums1[i];
                i--;
            }
            pq.poll();
        }
        
        for(int j = 0; j < n; j++)
        {
            if(ans[j] == -1)
                ans[j] = nums1[i--];
        }
        return ans;
    }
}