class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList();
        int i, j;
        for(i = 0; i <= rowIndex; i++)
        {
            pascal.add(new ArrayList<Integer>());
            for(j = 0; j <= i; j++)
            {
                if(j == 0 || j == i)
                    pascal.get(i).add(1);
                else
                {
                    int x = pascal.get(i-1).get(j-1);
                    int y = pascal.get(i-1).get(j);
                    pascal.get(i).add(x+y);
                }
            }
        }
        return pascal.get(rowIndex);
    }
}