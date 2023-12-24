class Solution {
    public int minOperations(String s) {
        //s starts with 0
        int c1 = 0;
        //s starts with 1
        int c2 = 0;
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                if(s.charAt(i) == '1')
                    c1++;
                else
                    c2++;
            }
            else{
                if(s.charAt(i) == '1')
                    c2++;
                else
                    c1++;
            }
        }
        return Math.min(c1, c2);
    }
}