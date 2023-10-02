class Solution {
    public int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        int count = n;
        boolean left = true;
        
        while(count > 1)
        {
            if(left || count%2 == 1)
                head = head + step;
            
            step = step * 2;
            count = count/2;
            left = !left;
        }
        return head;
    }
}