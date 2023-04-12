class Solution {
    public int convertTime(String current, String correct) {
        int min1 = Integer.valueOf(current.substring(3));
        int min2 = Integer.valueOf(correct.substring(3));
        int hr1 = Integer.valueOf(current.substring(0, 2));
        int hr2 = Integer.valueOf(correct.substring(0, 2));
        
        int t1 = hr1*60 + min1;
        int t2 = hr2*60 + min2;
        
        int diff = t2-t1;
        
        int op = 0;
        op += (diff/60);
        diff = diff % 60;
        op += diff/15;
        diff = diff % 15;
        op += diff/5;
        diff = diff % 5;
        op += diff;
        return op;
    }
}