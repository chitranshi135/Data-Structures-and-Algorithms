class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty())
                stack.push(s.charAt(i));
            else{
                char top = stack.peek();
                
                if(Math.abs(top-s.charAt(i)) == 32)
                    stack.pop();
                else
                    stack.push(s.charAt(i));
            }
        }
        
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            str.insert(0, stack.pop());
        }
        return str.toString();
    }
}