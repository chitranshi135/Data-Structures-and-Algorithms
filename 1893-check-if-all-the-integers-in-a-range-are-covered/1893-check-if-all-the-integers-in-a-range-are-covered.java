class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int i = left; i <= right; i++){
            boolean flag = false;
            for(int[] r : ranges){
                int start = r[0];
                int end = r[1];
                if(i >= start && i <= end){
                    flag = true;
                    break;
                }
            }
            if(!flag)
                return false;
        }
        return true;
    }
}