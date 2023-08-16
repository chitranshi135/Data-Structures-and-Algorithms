class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int n = nums.length;
        if (n == 0 || k == 0) {
            return new int[0];
        }
        int[] ans = new int[n-k+1];
        for(int i = 0; i < n; i++)
        {
            while(!q.isEmpty() && i - q.peekFirst() + 1 > k)
                q.pollFirst();
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i])
                q.pollLast();
            q.offerLast(i);
            if(i - k + 1 >= 0)
            ans[i-k+1] = nums[q.peekFirst()];
        }
        return ans;
    }
}