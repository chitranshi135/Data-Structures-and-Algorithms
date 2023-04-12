class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        for(int i = 0; i < arr.length; i++)
        {
            char c1 = arr[i].charAt(arr[i].length()-1);
            char c2 = arr[(i+1)%arr.length].charAt(0);
            if(c1 != c2)
                return false;
        }
        return true;
    }
}