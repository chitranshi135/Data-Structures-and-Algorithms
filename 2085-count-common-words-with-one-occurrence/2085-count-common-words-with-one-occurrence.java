class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        for(String w : words1)
        {
            map1.put(w, map1.getOrDefault(w, 0)+1);
        }
        Map<String, Integer> map2 = new HashMap<>();
        for(String w : words2)
        {
            map2.put(w, map2.getOrDefault(w, 0)+1);
        }
        int c = 0;
        for(String w : map1.keySet())
        {
            int f1 = map1.get(w);
            if(f1 != 1)
                continue;
            int f2 = map2.getOrDefault(w, 0);
            if(f2 == 1)
                c++;
        }
        return c;
    }
}