class Solution {
    int max = -1;
    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        int m = students.length;
        boolean[] taken = new boolean[m];
        solve(0, students, mentors, 0, taken);
        return max;
    }
    
    public void solve(int idx, int[][] students, int[][] mentors, int curr, boolean[] taken) {
        if(idx == students.length) {
            max = Math.max(max, curr);
            return;
        }
        
        for(int i = 0; i < mentors.length; i++) {
            if(!taken[i]) {
                taken[i] = true;
                
                int count = 0;
                for(int j = 0; j < students[0].length; j++) {
                    if(students[idx][j] == mentors[i][j])
                        count++;
                }
                
                solve(idx+1, students, mentors, curr+count, taken);
                
                taken[i] = false;
            }
        }
    }
}