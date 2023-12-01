class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            int curr = nums.get(i);
            int temp = i;
            int count = 0;
            while(temp > 0){
                if((temp & 1) == 1)
                    count++;
                temp >>= 1;
            }
            if(count == k)
                sum += curr;
        }
        return sum;
    }
}