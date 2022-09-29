class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        Set<String> set = new HashSet();
        List<List<Integer>> list = new LinkedList<>();
        for(int[] q : queens)
        {
            String str = q[0] + "," + q[1];
            set.add(str);
        }
        int x = king[0], y = king[1];
        for(int i = -1; i <= 1; i++)
        {
            for(int j = -1; j <= 1; j++)
            {
                if(i == 0 && j == 0)
                    continue;
                for(int k = 1; k <= 8; k++)
                {
                    int a = x + (i*k);
                    int b = y + (j*k);
                    String s = a+","+b;
                    if(set.contains(s))
                    {
                        list.add(Arrays.asList(a, b));
                        break;
                    }
                }
            }
        }
        return list;
    }
    
}