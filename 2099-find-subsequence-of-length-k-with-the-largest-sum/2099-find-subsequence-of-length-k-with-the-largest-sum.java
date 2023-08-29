class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> nums[a]-nums[b]);
        for(int i = 0; i < nums.length; i++){
            pq.offer(i);
            if(pq.size() > k)
                pq.poll();
        }
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(pq.contains(i))
                ans[j++] = nums[i];
        }
        return ans;
    }
}