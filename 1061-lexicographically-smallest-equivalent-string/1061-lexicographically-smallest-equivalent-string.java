class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        List<List<Integer>> graph = new ArrayList<>();
        boolean[] vis;
        for(int i = 0; i < 26; i++)
            graph.add(new ArrayList<>());
        for(int i = 0; i < s1.length(); i++)
        {
            int u = s1.charAt(i)-'a';
            int v = s2.charAt(i)-'a';
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        String ans = "";
        for(int i = 0; i < baseStr.length(); i++)
        {
            char ch = baseStr.charAt(i);
            vis = new boolean[26];
            int res = dfs((ch-'a'), graph, vis);
            ans = ans + (char)(res+'a');
        }
        return ans;
    }
    
    public int dfs(int c, List<List<Integer>> graph, boolean[] vis)
    {
        vis[c] = true;
        if(graph.get(c).size() == 0)
            return c;
        int min = c;
        for(int x : graph.get(c))
        {
            if(!vis[x])
            {
                int child =  dfs(x, graph, vis);
                min = Math.min(min, child);
            }
               
        }
        return min;
    }
}