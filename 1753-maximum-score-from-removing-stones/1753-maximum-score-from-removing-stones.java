class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> y-x);
        pq.add(a);
        pq.add(b);
        pq.add(c);
        int p = 0;
        while(pq.size() > 1)
        {
            int n1 = pq.poll();
            int n2 = pq.poll();
            p++;
            n1--;
            n2--;
            if(n1 > 0)
                pq.add(n1);
            if(n2 > 0)
                pq.add(n2);
        }
        return p;
    }
}