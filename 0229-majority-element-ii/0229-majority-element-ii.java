class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        //Moore's Voting Algorithm
        //There can be a maximum of 2 elements
        List<Integer> ans = new ArrayList<>();
        int ele1 = Integer.MAX_VALUE;
        int ele2 = Integer.MAX_VALUE;
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0; i < n; i++){
            if(count1 == 0 && nums[i] != ele2){
                ele1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0 && nums[i] != ele1){
                ele2 = nums[i];
                count2 = 1;
            }
            else if(nums[i] == ele1)
                count1++;
            else if(nums[i] == ele2)
                count2++;
            else{
                count1--;
                count2--;
            }
        }
        count1 = count2 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == ele1)
                count1++;
            else if(nums[i] == ele2)
                count2++;
        }
        if(count1 > n/3)
            ans.add(ele1);
        if(count2 > n/3)
            ans.add(ele2);
        
        return ans;
    }
}