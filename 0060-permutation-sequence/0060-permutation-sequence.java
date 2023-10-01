class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i < n; i++)
        {
            fact *= i;
            nums.add(i);
        }
        nums.add(n);
        String ans = "";
        //zero based numbering
        k = k-1;
        while(true)
        {
            ans = ans + String.valueOf(nums.get(k/fact));
            nums.remove(k/fact);
            if(nums.size() == 0)
                break;
            k = k%fact;
            fact = fact/nums.size();
        }
        return ans;
    }
}