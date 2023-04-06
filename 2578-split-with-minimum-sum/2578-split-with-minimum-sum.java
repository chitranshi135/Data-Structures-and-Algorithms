class Solution {
    public int splitNum(int num) {
        char[] c = (String.valueOf(num)).toCharArray();
        Arrays.sort(c);
        String n1 = "", n2 = "";
        for(int i = 0; i < c.length; i++)
        {
            if(i % 2 == 0)
                n1 = n1 + c[i];
            else
                n2 = n2 + c[i];
        }
        return Integer.valueOf(n1)+Integer.valueOf(n2);
    }
}