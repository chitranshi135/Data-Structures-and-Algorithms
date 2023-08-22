class Solution {
    public String convertToTitle(int col) {
        String str = "";
        while(col > 0){
            col -= 1;
            int n = col % 26;
            str = (char)(n+65) + str;
            col /= 26;
        }
        return str;
    }
}