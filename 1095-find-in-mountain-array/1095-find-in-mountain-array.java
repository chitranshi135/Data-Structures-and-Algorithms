/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray m) {
        int n = m.length();
        int start = 0, end = n-1;
        while(start < end)
        {
            int mid = start + (end-start)/2;
            if(m.get(mid) > m.get(mid+1))
                end = mid;
            else
                start = mid+1;
        }
        int peak = start;
        if(m.get(peak) == target)
            return peak;
        int x = bsASC(0, peak-1, target, m);
        int y = bsDSC(peak+1, n-1, target, m);
        if(x != -1 && y != -1)
            return Math.min(x,y);
        else
            return Math.max(x, y);
    }
    
    int bsASC(int left, int right, int target, MountainArray m)
    {
        int mid;
        while(left <= right) {
            mid = left + (right - left)/2;
            if(m.get(mid) == target)
                return mid;
            else if(target < m.get(mid))
                right = mid - 1;
            else
                left = mid+1;
        }
        return -1;
    }
    
    int bsDSC(int left, int right, int target, MountainArray m)
    {
        int mid;
        while(left <= right) {
            mid = left + (right - left)/2;
            if(m.get(mid) == target)
                return mid;
            else if(target < m.get(mid))
                left = mid+1;
            else
                right = mid-1;
            }
        return -1;
    }
}