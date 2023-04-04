class FindSumPairs {
    int[] nums1;
    int[] nums2;
    HashMap<Integer, Integer> freq = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for(int x: nums2)
        {
            freq.put(x, freq.getOrDefault(x, 0)+1);
        }
    }
    
    public void add(int index, int val) {
        int v = nums2[index];
        int f = freq.get(v);
        if(f == 1)
            freq.remove(v);
        else 
            freq.put(v, f-1);
        nums2[index] += val;
        v = nums2[index];
        freq.put(v, freq.getOrDefault(v, 0)+1);
    }
    
    public int count(int tot) {
        int count = 0;
        for(int i = 0; i < nums1.length; i++)
        {
            int v = tot-nums1[i];
            if(freq.containsKey(v))
            {
                count += freq.get(v);
            }
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */