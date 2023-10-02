class Solution {
    public List<Integer> diffWaysToCompute(String exp) {
        List<Integer> list = new ArrayList<>();
        if(exp.length() <= 2)
        {
            list.add(Integer.valueOf(exp));
            return list;
        }
        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*')
            {
                List<Integer> part1 = diffWaysToCompute(exp.substring(0, i));
                List<Integer> part2 = diffWaysToCompute(exp.substring(i+1));
                for(int a : part1)
                {   int res = 0;
                    for(int b : part2)
                    {
                        if(ch == '+')
                            res = a+b;
                        else if(ch == '-')
                            res = a-b;
                        else if(ch == '*')
                            res = a*b;
                        
                        list.add(res);
                    }
                }
            }
        }
        return list;
    }
}