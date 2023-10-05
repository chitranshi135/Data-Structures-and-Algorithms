class Solution {
    public int countArrangement(int n) {
        int[] count = new int[1];
        solve(1, n, new ArrayList<Integer>(), count);
        return count[0];
    }
    
    public void solve(int idx, int n, List<Integer> list, int[] count) {
        if(idx > n)
        {
            count[0]++;
            return;
        }
        
        for(int i = 1; i <= n; i++) {
            if(!list.contains(i)){
                if(idx % i == 0 || i % idx == 0){
                    list.add(i);
                    solve(idx+1, n, list, count);
                    list.remove(list.size()-1);
                }
            }
        }
    }
}