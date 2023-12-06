class Solution {
    public int totalMoney(int n) {
        int a = 1;
        int tot = 0;
        while(n > 7){
            tot += (7* (2*a + 6)) / 2;
            a++;
            n -= 7;
        }
        tot += (n * (2*a + (n-1))) / 2;
        return tot;
    }
}