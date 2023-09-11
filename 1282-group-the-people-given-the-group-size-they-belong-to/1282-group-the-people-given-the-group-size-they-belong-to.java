class Solution {
    public List<List<Integer>> groupThePeople(int[] group) {
        int n = group.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            int s = group[i];
            List<Integer> temp = new ArrayList<>();
            if(map.containsKey(s))
                temp = map.get(s);
            temp.add(i);
            map.put(s, temp);
            if(temp.size() == s)
            {
                list.add(map.get(s));
                map.remove(s);
            }
        }
        return list;
    }
}