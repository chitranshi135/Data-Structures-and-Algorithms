class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<Double> set = new HashSet<>();
        int i = 0, j = n-1;
        while(i < j)
        {
            double avg = (nums[i++]+nums[j--])/2.0;
            set.add(avg);
        }
        return set.size();
    }
}