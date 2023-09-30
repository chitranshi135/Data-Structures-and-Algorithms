class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int[] freq = new int[21];
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]+10]++;
        }
        choose(freq, 0, list, ans);
        return ans;
    }
    
    public void choose(int[] freq, int i, List<Integer> list, List<List<Integer>> ans){
        if(i > 20)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        int val = i-10;
        
        if(freq[i] > 0){
            list.add(val);
            freq[i]--;
            choose(freq, i, list, ans);
            list.remove(list.size()-1);
            freq[i]++;
        }
        choose(freq, i+1, list, ans);
    }
}