class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        //now we go and find overlapping intervals
        //we chose the interval with shorter end time a
        //as it has less chance of overlapping

        int prevEnd = Integer.MIN_VALUE;
        int added = 0;
        for(int[] curr : intervals)
        {
            if(curr[0] < prevEnd)
            {
                //overlap found
                //choose the interval with smaller end time
                //but count will not change
                //as we have to simple update the prev interval in the list
                prevEnd = Math.min(prevEnd, curr[1]);
            }
            else
            {
                added++;
                prevEnd = curr[1];
            }
        }
        return intervals.length - added;
    }
}