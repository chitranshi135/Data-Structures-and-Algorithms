//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] price = new int[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                price[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            sln.stockBuySell(price, n);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public void stockBuySell(int[] price, int n) {
        int start = 0, end = -1;
        int min = price[0];
        int c = 0;
        for(int i = 1; i < n; i++)
        {
            if(price[i] > min)
            {
                min = price[i];
                end = i;
            }
            else if(price[i] < min)
            {
                if(end != -1)
                {
                    c++;
                    System.out.print("("+start+" "+end+") ");
                }
                start = i;
                end = -1;
                min = price[i];
            }
            
            if(i == n-1 && end != -1)
            {
                c++;
                System.out.print("("+start+" "+end+") ");
            }
        }
        if(c == 0)
            System.out.println("No Profit");
        else
            System.out.println();
    }
}