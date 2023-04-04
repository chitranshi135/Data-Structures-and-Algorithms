class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
                pq.add(nums[i]);
         
        }
        int count=0;
		while(pq.size()>0) {
			int n = pq.poll();
			count++;
			for(int j=0;j<nums.length;j++)
            {
                if(nums[j]!=0) 
                    nums[j]=nums[j]-n;
            }
            int sum = 0;
            for(int i=0;i<nums.length;i++)
                sum += nums[i];
            if(sum == 0) 
                return count;
            pq.clear();
            for(int i=0;i<nums.length;i++){
			    if(nums[i]==0) 
                    continue;
			    else 
                    pq.offer(nums[i]);
		    }
		}
        return count;
    }
}