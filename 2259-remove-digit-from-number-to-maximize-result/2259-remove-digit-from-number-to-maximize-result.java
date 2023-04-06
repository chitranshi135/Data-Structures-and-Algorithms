class Solution {
    public String removeDigit(String number, char digit) {
        int idx = -1;
        for(int i = 0; i < number.length(); i++)
        {
            char ch = number.charAt(i);
            if(ch == digit)
            {
                idx = i;
                if(idx+1 < number.length() && ch < number.charAt(idx+1))
                    break;
            }
        }
        return number.substring(0, idx)+number.substring(idx+1);
    }
}