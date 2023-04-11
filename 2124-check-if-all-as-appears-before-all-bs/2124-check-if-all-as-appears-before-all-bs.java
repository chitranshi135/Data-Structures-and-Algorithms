class Solution {
    public boolean checkString(String s) {
        int i1 = -1, i2 = -1;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' && i2 != -1)
                return false;
            else if(ch == 'b')
                i2 = i;
        }
        return true;
    }
}