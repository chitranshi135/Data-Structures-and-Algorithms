//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.minimum_Number(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String minimum_Number(String s)
    {
        int[] freq = new int[10];
        for(int i = 0; i < s.length(); i++)
            freq[s.charAt(i)-'0']++;
        //all zeroes
        if(freq[0] == s.length())
            return s;
            
        StringBuilder str = new StringBuilder();
        for(int i = 1; i < 10; i++){
            if(freq[i] > 0){
                str.append((char)(i+'0'));
                freq[i]--;
                break;
            }
        }
        for(int i = 0; i < 10; i++){
            while(freq[i] > 0){
                str.append((char)(i+'0'));
                freq[i]--;
            }
        }
        return str.toString();
    }
}