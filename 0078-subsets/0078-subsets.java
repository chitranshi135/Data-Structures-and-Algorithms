class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int n : nums)
        {
            int s = list.size();
            for(int i = 0; i < s; i++)
            {
                List<Integer> al = new ArrayList<>(list.get(i));
                al.add(n);
                list.add(al);
            }
        }
        return list;
    }
}