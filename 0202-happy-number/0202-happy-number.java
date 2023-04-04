class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int s;
        while(n > 1 && !set.contains(n))
        {
            set.add(n);
            s = 0;
            while(n > 0)
            {
                s += (n % 10) * (n % 10);
                n = n/10;
            }
            n = s;
            
        }
        return n == 1;
    }
}