class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a,b)->a.length()-b.length());
        int res = 0;
        Map<String, Integer> map = new HashMap<>();
        int n = words.length;
        for(int i = 0; i < n; i++)
        {
            int l = 1;
            String w = words[i];
            for(int j = 0; j < w.length(); j++)
            {
                String sub = w.substring(0,j)+w.substring(j+1);
                l = Math.max(l, map.getOrDefault(sub, 0)+1);
            }
            map.put(w, l);
            res = Math.max(res, l);
        }
        return res;
    }
}