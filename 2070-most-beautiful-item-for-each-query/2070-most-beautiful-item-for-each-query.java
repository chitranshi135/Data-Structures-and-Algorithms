class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        //sort items on the basis of price
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        int n = queries.length;
        
        int[] result = new int[n];
        
        int[][]queryIndex = new int[n][2];
        
        for(int i=0; i<n; i++)
        {
            queryIndex[i][0] = queries[i];
            queryIndex[i][1] = i; 
        }
        Arrays.sort(queryIndex, (a, b)->a[0]-b[0]);
        
        int maxBeauty = 0; 
        int itemIndex = 0; 

        for(int i=0; i<n; i++)
        {
          int currIndex = queryIndex[i][1];
          int currPrice = queryIndex[i][0];
          while(itemIndex<items.length && currPrice>=items[itemIndex][0])
          {
            maxBeauty = Math.max(maxBeauty, items[itemIndex][1]);
            itemIndex++;
          }
          result[currIndex] = maxBeauty;
        }

         return result;
    }
}