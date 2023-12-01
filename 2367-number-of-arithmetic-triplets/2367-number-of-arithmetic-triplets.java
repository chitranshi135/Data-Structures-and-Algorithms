class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for(int i = 1; i < nums.length-1; i++){
            if(binarySearch(nums, 0, i-1, nums[i]-diff) && binarySearch(nums, i+1, nums.length-1, nums[i]+diff))
                count++;
        }
        return count;
    }
    
    public boolean binarySearch(int[] nums, int start, int end, int x){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == x)
                return true;
            else if(x > nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return false;
    }
}