class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int tot = 0;
        for(int x: arr)
            tot += x;
        if(tot % 3 != 0)
            return false;
        tot = tot/3;
        int c = 0, sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            if(sum == tot)
            {
                c++;
                sum = 0;
            }
        }
        return c >= 3;
    }
}