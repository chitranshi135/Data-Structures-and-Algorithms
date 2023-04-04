class Solution {
    public String largestOddNumber(String num) {
        int d = -1;
        int i;
        for(i = num.length()-1; i >= 0; i--)
        {
            d = num.charAt(i)-'0';
            if(d % 2 == 1)
                break;
        }
        if(i == -1)
            return "";
        return num.substring(0, i+1);
    }
}