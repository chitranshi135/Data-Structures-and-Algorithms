class Solution {
    public boolean coprime(int n1, int n2){
        int x = Math.min(n1, n2);
        for(int i = 2; i <= x; i++){
            if(n1 % i == 0 && n2 % i == 0)
                return false;
        }
        return true;
    }
    
    public int countBeautifulPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int n1 = String.valueOf(nums[i]).charAt(0)-'0';
            for(int j = i+1; j < n; j++){
                int n2 = nums[j] % 10;
                if(coprime(n1, n2))
                    count++;
            }
        }
        return count;
    }
}