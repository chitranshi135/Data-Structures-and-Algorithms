class Solution {
    public long smallestNumber(long num) {
        boolean neg = false;
        if(num < 0)
            neg = true;
        num = Math.abs(num);
        char[] c = (String.valueOf(num)).toCharArray();
        int i;
        long n;
        Arrays.sort(c);
        if(!neg)
        {
            i = 0;
            int zeros = 0;
            while(i < c.length && c[i] == '0')
            {
                i++;
                zeros++;
            }
            System.out.println(i+" "+zeros);
            if(i == c.length)
                return 0L;
            n = c[i++]-'0';
            while(zeros > 0)
            {
                n = n*10;
                zeros--;
            } 
            for(; i < c.length; i++)
            {
                n = n*10 + c[i]-'0';
            }
        }
        else
        {
            n = 0;
            for(i = c.length-1; i >= 0; i--)
            {
                n = n*10 + c[i]-'0';
            }
            n *= -1;
        }
        return n;
    }
}