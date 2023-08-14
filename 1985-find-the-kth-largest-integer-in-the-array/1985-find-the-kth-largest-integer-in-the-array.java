class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>((a, b)->{
            if(a.length() == b.length())
                return a.compareTo(b);
            else
                return Integer.compare(a.length(), b.length());
        });
        for(int i = 0; i < nums.length; i++)
        {
            pq.offer(nums[i]); 
            if(pq.size() > k)
                pq.poll();
        }
        System.out.println(pq);
        return pq.poll();
    }
}