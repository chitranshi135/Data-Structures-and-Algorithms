class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        if(n < 4)
            return arr[0];
        int x = n/4;
        int c = 1;
        for(int i = 0; i < n-1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                c++;
                if(c > x)
                    return arr[i];
            }
            else
            {
                c = 1;
            }
        }
        return -1;
    }
}