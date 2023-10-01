class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        solve(s, list, ans);
        return ans;
    }
    
    public boolean isPalin(String str) {
        int n = str.length();
        int i = 0, j = n-1;
        while(i <= j)
        {
            //System.out.println(str.charAt(i)+" "+str.charAt(j));
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public void solve(String s, List<String> list, List<List<String>> ans) {
        if(s == "")
        {
            if(list.size() > 0)
                ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < s.length(); i++)
        {
            String str1 = s.substring(0, i+1);
            //System.out.println(str1);
            if(isPalin(str1)){
                //System.out.println(str1+" "+isPalin(str1));
                list.add(str1);
                String str2 = s.substring(i+1);
                solve(str2, list, ans);
                list.remove(list.size()-1);
            }
        }
    }
}