class Solution {
    public int maxEvents(int[][] events) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int d = 1;
        int i = 0, n = events.length;
        int ans = 0;
        while(i < n || !pq.isEmpty())
        {
            //expired events
            while(!pq.isEmpty() && pq.peek() < d)
                pq.poll();
            //add events that start on that day
            while(i < n && events[i][0] == d)
                pq.add(events[i++][1]);
            //attend events which expire first
            if(!pq.isEmpty())
            {
                ans++;
                pq.poll();
            }
            d++;
        }
        return ans;
    }
}