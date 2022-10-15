class Solution {
    public int minDeletion(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int x = 0;
        for(int i = 0; i < n; i++)
        {
            if(x%2 == 1 && !stack.isEmpty() && stack.peek() == nums[i])
                continue;
            else
            {
                stack.push(nums[i]);
                x++;
            }
        }
        n = n-stack.size();
        return stack.size()%2 == 0? n:n+1;
    }
}