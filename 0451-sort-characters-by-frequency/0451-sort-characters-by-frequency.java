class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        int[] freq = new int[256];
        char[] c = s.toCharArray();
        for(int i = 0; i < n; i++)
            freq[(int)c[i]]++;
        char[] ans = new char[n];
        int x = 0;
        while(x < n)
        {
            int max = 0;
            char ch = '*';
            for(int i = 0; i < 256; i++)
            {
                if(freq[i] > max)
                {
                    max = freq[i];
                    ch = (char)(i);
                }
            }
            if(max == 0)
                break;
            while(max > 0)
            {
                ans[x++] = ch;
                max--;
            }
            freq[(int)ch] = 0;;
        }
        return String.valueOf(ans);
    }
}