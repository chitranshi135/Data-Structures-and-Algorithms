class Solution {
    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int count = 1;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(set.contains(ch))
            {
                set.clear();
                set.add(ch);
                count++;
            }
            set.add(ch);
        }
        return count;
    }
}