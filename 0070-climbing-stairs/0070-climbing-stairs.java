class Solution {
    int[] ways = new int[46];
    public int climbStairs(int n) {
        if(n <= 3)
            return n;
        if(ways[n] != 0)
            return ways[n];
        else
            return ways[n] = climbStairs(n-1)+climbStairs(n-2);
    }
}