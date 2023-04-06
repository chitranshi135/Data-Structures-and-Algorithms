class Solution {
    public int splitNum(int num) {
        char[] c = (String.valueOf(num)).toCharArray();
        Arrays.sort(c);
        int num1 = 0, num2 = 0;
        for(int i = 0; i < c.length; i++)
        {
            if(i % 2 == 0)
                num1 = num1 * 10 + (c[i] - '0');
            else
                num2 = num2 * 10 + (c[i] - '0');
        }
        return num1+num2;
    }
}