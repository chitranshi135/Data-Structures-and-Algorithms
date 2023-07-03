class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        
        if(s.equals(goal)){
            Set<Character> set = new HashSet<>();
            for(char c : s.toCharArray()){
                set.add(c);
            }
            //if some duplicate is present, then swap possible
            if(set.size() < s.length())
                return true;
            else
                return false;
        }
        else{
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != goal.charAt(i))
                    list.add(i);
            }
            if(list.size() == 2 && s.charAt(list.get(0)) == goal.charAt(list.get(1)) && s.charAt(list.get(1)) == goal.charAt(list.get(0)))
                return true;
            else
                return false;
        }
    }
}