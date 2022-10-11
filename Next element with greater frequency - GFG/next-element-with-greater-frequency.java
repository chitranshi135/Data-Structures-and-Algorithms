//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int arr[] = new int[10000];
        
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            solver x = new solver();
            int res[]=x.print_next_greater_freq(arr,n);
            StringBuffer sb=new StringBuffer("");
            for(int i : res){
                sb.append(i+" ");
            }
            System.out.println(sb);
        }
    }
}

// } Driver Code Ends


class solver
{
    static int[] print_next_greater_freq(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++)
        {
            if(!map.containsKey(arr[i]))
                map.put(arr[i], 0);
            map.put(arr[i], map.get(arr[i])+1);
        }
        Stack<int[]> stack = new Stack<>();
        for(int i = n-1; i >= 0; i--)
        {
            while(!stack.isEmpty() && stack.peek()[1] <= map.get(arr[i]))
                stack.pop();
            if(!stack.isEmpty())
            {
                ans[i] = stack.peek()[0];
            }
            else
                ans[i] = -1;
            stack.push(new int[] {arr[i], map.get(arr[i])});
        }
        return ans;
    }
}

