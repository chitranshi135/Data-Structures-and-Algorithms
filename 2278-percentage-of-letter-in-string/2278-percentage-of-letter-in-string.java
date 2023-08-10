class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == letter)
                count++;
        }
        int l = s.length();
        int p = (int)(Math.abs(count*100.0/l));
        return p;
    }
}