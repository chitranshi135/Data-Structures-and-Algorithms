class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        String v = "aeiouAEIOU";
        int i = 0, j = n-1;
        while(i < j)
        {
            
            while(v.indexOf(c[i]) < 0 && i < j)
                i++;
            while(v.indexOf(c[j]) < 0 && j > i)
                j--;
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(c);
    }
}