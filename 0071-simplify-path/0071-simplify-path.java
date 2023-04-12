class Solution {
    public String simplifyPath(String path) {
        String[] list = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String curr : list)
        {
            if(!stack.isEmpty() && curr.equals(".."))
                stack.pop();
            
            else if(!curr.equals(".") && !curr.equals("") && !curr.equals(".."))
                stack.push(curr);
        }
        path = "";
        if(stack.isEmpty())
            return "/";
        while(!stack.isEmpty())
        {
            path = "/" + stack.pop() + path;
        }
        return path;
    }
}