class Solution {
    public int bestClosingTime(String customers) {
        char[] c = customers.toCharArray();
        int n = c.length;
        int[] pre = new int[n+1];
        //closing at ith hour, we need to find the number of Ns before i
        for(int i = 1; i <= n; i++){
            pre[i] = pre[i-1] + (c[i-1] == 'N' ? 1 : 0);
        }
        
        int min = Integer.MAX_VALUE;
        int hr = -1;
        int post = 0;
        for(int i = n; i >= 0; i--){
            //System.out.println(pre[i]);
            if(i < n && c[i] == 'Y')
                post++;
            if(pre[i]+post <= min){
                min = pre[i]+post;
                hr = i;
            }
        }
        return hr;
    }
}