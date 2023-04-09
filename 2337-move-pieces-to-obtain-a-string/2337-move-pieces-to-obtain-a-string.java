class Solution {
    public boolean canChange(String start, String target) {
        int i = 0, j = 0;
        int m = start.length(), n = target.length();
        while(i < m || j < n)
        {
            while(i < m && start.charAt(i) == '_')
                i++;
            while(j < n && target.charAt(j) == '_')
                j++;
            if(i == j && i == m)
                return true;
            else if(i == m || j == n || start.charAt(i) != target.charAt(j))
                return false;
            else if(target.charAt(j)=='L' && i < j)
                return false;
            else if(target.charAt(j)=='R' && i > j)
                return false;
            i++;
            j++;
        }
        return true;
    }
}