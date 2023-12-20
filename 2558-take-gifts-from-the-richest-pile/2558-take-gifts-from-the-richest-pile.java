class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->b-a);
        long tot = 0L;
        for(int x: gifts){
            pq.add(x);
            tot += x;
        }
        while(k > 0){
            int x = pq.poll();
            int rem = (int)Math.sqrt(x);
            pq.add(rem);
            tot -= (x-rem);
            k--;
        }
        return tot;
    }
}