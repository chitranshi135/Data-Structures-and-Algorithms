class Solution {
    public int countBinarySubstrings(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int tot = 0;
        int prevL = 0, currL = 1;
        for(int i = 1; i < n; i++)
        {
            if(arr[i-1] != arr[i])
            {
                int eq = Math.min(prevL, currL);
                tot += eq;
                prevL = currL;
                currL = 1;
            }
            else
                currL++;
        }
        tot += Math.min(prevL, currL);
        return tot;
    }
}