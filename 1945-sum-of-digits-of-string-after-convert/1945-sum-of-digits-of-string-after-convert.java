class Solution {
    public int getLucky(String n, int k) {
        String val = "";
        for(int i = 0; i < n.length(); i++)
        {
            char ch = n.charAt(i);
            val = val + String.valueOf(ch-'a'+1);
        }
        //System.out.println(val);
        int tot = 0;
        for(int i = 0; i < val.length(); i++)
        {
            tot += val.charAt(i)-'0';
        }
        k--;
        while(k > 0)
        {
            int s = 0;
            while(tot > 0)
            {
                s = s + (tot % 10);
                tot = tot/10;
            }
            tot = s;
            k--;
        }
        return tot;
    }
}