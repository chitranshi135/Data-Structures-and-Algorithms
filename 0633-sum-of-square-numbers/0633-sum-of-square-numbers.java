class Solution {
    public boolean judgeSquareSum(int c) {
        for(long a = 0; a*a <=c; a++)
        {
            int b = c-(int)(a*a);
            if(isPerfectSquare(b))
                return true;
        }
        return false;
    }
     public boolean isPerfectSquare(int num) {
        long start = 0, end = num;
        long mid;
        while(start <= end)
        {
            mid = start+(end-start)/2;
            if(mid*mid == num)
                return true;
            else if(mid*mid < num)
                start = mid+1;
            else
                end = mid-1;
        }
        return false;
    }
}