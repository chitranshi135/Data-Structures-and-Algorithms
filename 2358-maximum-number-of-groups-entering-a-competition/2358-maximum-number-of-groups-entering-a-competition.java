class Solution {
    public int maximumGroups(int[] grades) {
        //when array is sorted, then the next groups will have 
        //elements that are either larger or equal but since the
        //number of elements is greater, their sum will always be greater
        //even when length is increased only by 1
        
        //so we need to find the number of groups we can make
        //such that lengths are like-1,2,3 and so on
        //we need to find k such that k*(k+1)/2 is less than or equal to grades.length
        
        int tot = 0, k = 0;
        //k is the length of group
        //ith group has length i
        int n = grades.length;
        while(tot+k+1 <= n)
        {
            k++;
            tot += k;
        }
        return k;
    }
}