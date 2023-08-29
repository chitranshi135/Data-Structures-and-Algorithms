class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0]-a[0]);
        for (int i = 0; i < nums.length; i++){
            pq.offer(new int[]{nums[i], i});
        }


        Set<Integer> index = new HashSet<>();

        int count = 0;
        while (count != k) {

            int[]a = pq.peek();
            pq.poll();
            count++;
            index.add(a[1]);
        }

        int[] arr = new int[k];

        count = 0;
        for(int i=0; i<nums.length; i++){
           if (index.contains(i)){
               arr[count] = nums[i];
               count++;
           }
        }

        return arr;
    }
}