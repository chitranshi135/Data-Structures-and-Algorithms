class Solution {
    public int minCost(String colors, int[] neededTime) {
        char[] arr = colors.toCharArray();
        int time = 0, s = neededTime[0];;
        int max_group = neededTime[0];
        //we keep the element with max cost and delete all others
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i-1] != arr[i])
            {
                time += (s - max_group);
                s = 0;
                max_group = 0;
            }
            s += neededTime[i];
            max_group = Math.max(max_group, neededTime[i]);
        }
        time += (s - max_group);
        return time;
    }
}