class Solution {
    public long smallestNumber(long num) {
        boolean neg = false;
        if(num < 0)
            neg = true;
        num = Math.abs(num);
        int[] f = new int[10];
        while(num > 0)
        {
            f[(int)(num%10)]++;
            num = num/10;
        }
        int i;
        long n = 0;
        if(!neg)
        {
            i = 1;
            while(i < 10)
            {
                if(f[i] != 0)
                {
                    n = i;
                    f[i]--;
                    while(f[0] > 0)
                    {
                        n = n*10;
                        f[0]--;
                    }
                    break;
                }
                else
                    i++;
            }
            i = 1;
            while(i < 10)
            {
                while(f[i] > 0)
                {
                    n = n*10 + i;
                    f[i]--;
                }
                i++;
            }
        }
        else
        {
            n = 0;
            i = 9;
            while(i >= 0)
            {
                while(f[i] > 0)
                {
                    n = n*10 + i;
                    f[i]--;
                }
                i--;
            }
            n = n*-1;
        }
        return n;
    }
}