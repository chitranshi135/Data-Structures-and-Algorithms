class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> list=new ArrayList<Boolean>(); 
        int max = -1;
        int x;
        for(x = 0; x < candies.length; x++)
        {
            if(candies[x] > max)
                max = candies[x];
        }
        for(x = 0; x < candies.length; x++)
        {
            if(candies[x]+extraCandies >= max)
                    list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}