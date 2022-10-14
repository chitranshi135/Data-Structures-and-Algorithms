class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int tot = 0;
        int start = 0;
        int fuel = 0;
        for(int i = 0; i < n; i++)
        {
            int curr = gas[i]-cost[i];
            tot += curr;
            if(fuel + curr < 0)
            {
                start = i+1;
                fuel = 0;
            }
            else
                fuel += curr;
        }
        return (tot < 0)? -1 : start;
    }
}