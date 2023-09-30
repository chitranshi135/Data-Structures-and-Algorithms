class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int freq[] = new int[51];
        for(int i = 0; i < candidates.length; i++)
            freq[candidates[i]]++;
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        choose(freq, target, 1, ans, list);
        return ans;
    }
    
    public void choose(int[] freq, int target, int i, List<List<Integer>> ans, List<Integer> list){
        if(i > 50 || i > target){
            if(target == 0)
                ans.add(new ArrayList<>(list));
            return;
        }
        
        if(freq[i] > 0){
            //add
            list.add(i);
            freq[i]--;
            choose(freq, target-i, i, ans, list);
            
            //remove
            list.remove(list.size()-1);
            freq[i]++;
        }
        
        choose(freq, target, i+1, ans, list);
        
    }
}