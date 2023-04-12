class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int prev = -1;
        for(String str : arr)
        {
            char ch = str.charAt(0);
            if(ch >= '0' && ch <= '9')
            {
                int n = Integer.valueOf(str);
                if(n <= prev)
                    return false;
                prev = n;
            }
        }
        return true;
    }
}