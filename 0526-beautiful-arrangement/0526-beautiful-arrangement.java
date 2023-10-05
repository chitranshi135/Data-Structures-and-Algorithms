class Solution {
    int count = 0;
    public int countArrangement(int n) {
        solve(1, n, new ArrayList<Integer>());
        return count;
    }
    
    public void solve(int idx, int n, List<Integer> list) {
        if(idx > n)
        {
            count++;
            return;
        }
        
        for(int i = 1; i <= n; i++) {
            if(!list.contains(i)){
                if(idx % i == 0 || i % idx == 0){
                    list.add(i);
                    solve(idx+1, n, list);
                    list.remove(list.size()-1);
                }
            }
        }
    }
}