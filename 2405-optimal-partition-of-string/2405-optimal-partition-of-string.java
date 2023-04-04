class Solution {
        public int partitionString(String s) {
        int[] pos = new int[26];
        Arrays.fill(pos, -1);
        pos[s.charAt(0)-'a'] = 0;
        int res = 1, currStart = 0;
        for (int i = 1; i < s.length(); ++i) {
            if (pos[s.charAt(i) - 'a'] >= currStart) {
                ++res;
                currStart = i;
            }
            pos[s.charAt(i) - 'a'] = i;
        }
        return res;  
    }
}