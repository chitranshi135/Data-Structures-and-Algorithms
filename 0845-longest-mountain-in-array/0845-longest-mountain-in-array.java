class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int i = 0;
        int max = 0;
        while(i < n)
        {
            int j = i;
            //if mountain is starting here
            if(j+1 < n && arr[j]<arr[j+1])
            {
                while(j+1 < n && arr[j]<arr[j+1])
                    j++;
                //if its a peak, it must decrease after this point
                if(j+1 < n && arr[j]>arr[j+1])
                {
                    while(j+1 < n && arr[j]>arr[j+1])
                        j++;
                    //valid mountain
                    max = Math.max(max, j-i+1);
                }
                i = j;
            }
            else
                i++;
            
        }
        return max;
    }
}