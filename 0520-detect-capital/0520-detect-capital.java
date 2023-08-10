class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1)
            return true;
        boolean allUpperCase = true, allLowerCase = true;
        char[] c = word.toCharArray();
        for(int i = 1; i < c.length; i++){
            boolean res = Character.isUpperCase(c[i]);
            allUpperCase &= res;
            allLowerCase &= !res;
        }
        boolean start = Character.isUpperCase(c[0]);
        //System.out.println(start+" "+allUpperCase+" "+allLowerCase);
        if((start && allUpperCase) || (allLowerCase))
            return true;
        return false;
    }
}