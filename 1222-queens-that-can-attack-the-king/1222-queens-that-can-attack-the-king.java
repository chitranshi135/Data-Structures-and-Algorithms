class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        Set<String> set = new HashSet();
        List<List<Integer>> list = new LinkedList<>();
        for(int[] q : queens)
        {
            String str = q[0] + "," + q[1];
            set.add(str);
        }
        
        for(int i = -1; i <= 1; i++)
        {
            for(int j = -1; j <= 1; j++)
            {
                if(i == 0 && j == 0)
                    continue;
                int x = king[0], y = king[1];
                 while (x + i >= 0 && x + i < 8 && y + j >= 0 && y + j < 8) {
                    x += i;
                    y += j;
                    if (set.contains(x+","+y)) {
                        list.add(Arrays.asList(x, y));
                        break;
                    }
                }
            }
        }
        return list;
    }
    
}