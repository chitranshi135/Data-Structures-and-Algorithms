class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(pq.size() == k && nums[i] > pq.peek())
                pq.poll();
            if(pq.size() < k)
                pq.add(nums[i]);
        }
        return pq.poll();
    }
}