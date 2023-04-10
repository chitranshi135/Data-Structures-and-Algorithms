class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int n = security.length;
        List<Integer> list = new ArrayList<>();
        int[] larger = new int[n];
        for(int i = n-2; i >= 0; i--)
        {
            if(security[i+1] >= security[i])
                larger[i] = larger[i+1]+1;
        }
        int smaller = 0;
        for(int i = 0; i < n; i++)
        {
            if(i-1 >= 0 && security[i] <= security[i-1])
                smaller++;
            else
                smaller = 0;
            
            if(smaller >= time && larger[i] >= time)
                list.add(i);
        }
        return list;
    }
}