class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(1, n, k, ans, list);
        return ans;
    }
    
    public void solve(int val, int n, int k, List<List<Integer>> ans, List<Integer> list) {
        if(k == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = val; i <= n; i++)
        {
            list.add(i);
            solve(i+1, n, k-1, ans, list);
            list.remove(list.size()-1);
        }
    }
}