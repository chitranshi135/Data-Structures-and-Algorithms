class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->nums2[b]-nums2[a]);
        for(int i = 0; i < n; i++)
        {
            //for nums1
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
            //for nums2
            pq.add(i);
        }
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        while(!pq.isEmpty())
        {
            int idx = pq.poll();
            int val = map.lastKey();
            if(val > nums2[idx])
            {
                ans[idx] = val;
            }
            else
            {
                val = map.firstKey();
                ans[idx] = val;
            }
            int f = map.get(val);
            if(f == 1)
                map.remove(val);
            else
                map.put(val, f-1);
        }
        return ans;
    }
}