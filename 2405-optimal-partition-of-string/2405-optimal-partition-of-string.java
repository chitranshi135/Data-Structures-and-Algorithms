class Solution {
        public int partitionString(String s) {
        int[] pos = new int[26];
        int res = 0, currStart = -1;
        for (int i = 0; i < s.length(); ++i) {
            if (pos[s.charAt(i) - 'a'] >= currStart) {
                ++res;
                currStart = i+1;
            }
            pos[s.charAt(i) - 'a'] = i+1;
        }
        return res;  
    }
}