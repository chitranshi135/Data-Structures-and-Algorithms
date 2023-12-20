class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            str.append(words[i]);
            if(str.length() >= s.length())
                break;
        }
        if(str.length() == s.length() && str.indexOf(s) == 0)
            return true;
        return false;
    }
}