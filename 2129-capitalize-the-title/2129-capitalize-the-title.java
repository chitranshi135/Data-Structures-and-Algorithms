class Solution {
    public String capitalizeTitle(String title) {
        char[] t = title.toCharArray();
        for(int i = 0; i < t.length; i++)
        {
            int start = i;
            while(i < t.length && t[i] != ' ')
            {
                t[i] = Character.toLowerCase(t[i]);
                i++;
            }
            if(i-start > 2)
                t[start] = Character.toUpperCase(t[start]);
        }
        return String.valueOf(t);
    }
}