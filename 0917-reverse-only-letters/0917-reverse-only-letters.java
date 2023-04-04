class Solution {
    public String reverseOnlyLetters(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int i = 0, j = n-1;
        while(i < j)
        {
            
            while(!Character.isLetter(c[i]) && i < j)
                i++;
            while(!Character.isLetter(c[j]) && j > i)
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