class Solution {
    public boolean find132pattern(int[] arr) {
        int n = arr.length;
        int[] smallest = new int[n];
        int min = arr[0];
        smallest[0] = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] > min)
            {
                smallest[i] = min;
            }
            else
            {
                smallest[i] = Integer.MIN_VALUE;
                min = Math.min(min, arr[i]);
            }
        }
        Stack<Integer> stack = new Stack<>();
        //greatest of smaller ele to right
        //this stack is descending order
        for(int i = n-1; i >= 0; i--)
        {
            while(!stack.isEmpty() && stack.peek() <= smallest[i])
                stack.pop();
            if(!stack.isEmpty() && smallest[i] != Integer.MIN_VALUE && stack.peek() < arr[i])
                return true;
            stack.push(arr[i]);
        }
        return false;
    }
}