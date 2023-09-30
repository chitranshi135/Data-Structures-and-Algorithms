class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        choose(candidates, target, 0, ans, list);
        return ans;
    }
    
    public void choose(int[] candidates, int target, int i, List<List<Integer>> ans, List<Integer> list){
        if(i == candidates.length){
            if(target == 0)
                ans.add(new ArrayList<>(list));
            return;
        }
          
        if(candidates[i] > target)
            choose(candidates, target, i+1, ans, list);
        else
        {
            //take
            list.add(candidates[i]);
            choose(candidates, target-candidates[i], i, ans, list);
            
            //not take
            list.remove(list.size()-1);
            choose(candidates, target, i+1, ans, list);
        }
    }
}