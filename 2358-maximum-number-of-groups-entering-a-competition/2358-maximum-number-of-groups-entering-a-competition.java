class Solution {
    public int maximumGroups(int[] grades) {
        Arrays.sort(grades);
        int prevSum = 0, groups = 0;
        int n = grades.length;
        int s = 0;
        int i = 0, j = 0;
        int prevL = 0;
        while(j < n)
        {
            s += grades[j];
            if(j-i+1 > prevL && s > prevSum)
            {
                groups++;
                prevL = j-i+1;
                prevSum = s;
                i = j+1;
                s = 0;
            }
            j++;
        }
        return groups;
    }
}