class CustomStack {
    int[] stack;
    int max;
    int i;
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        i = 0;
        max = maxSize;
    }
    //0 based index
    public void push(int x) {
        if(i < max)
            stack[i++] = x;
    }
    
    public int pop() {
        if(i == 0)
            return -1;
        return stack[--i];
    }
    
    public void increment(int k, int val) {
        if(i == 0)
            return;
        int x = 0;
        while(x < k && x < i)
        {
            stack[x] += val;
            x++;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */