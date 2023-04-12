class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        for(String w : s1.split(" "))
        {
            map.put(w, map.getOrDefault(w, 0)+1);
        }
        for(String w : s2.split(" "))
        {
            map.put(w, map.getOrDefault(w, 0)+1);
        }
        
        List<String> list = new ArrayList<>();
        for(String w : map.keySet())
        {
            if(map.get(w) == 1)
                list.add(w);
        }
        return list.toArray(new String[list.size()]);
    }
}