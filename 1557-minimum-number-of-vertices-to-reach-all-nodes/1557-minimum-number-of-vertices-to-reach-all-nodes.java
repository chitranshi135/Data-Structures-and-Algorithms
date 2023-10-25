class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] indegree = new int[n];
        for(int i = 0; i < edges.size(); i++){
            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);
            indegree[v]++;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(indegree[i] == 0)
                list.add(i);
        }
        return list;
    }
}