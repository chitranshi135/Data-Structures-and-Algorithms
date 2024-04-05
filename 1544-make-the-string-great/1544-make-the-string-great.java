class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty())
                stack.push(s.charAt(i));
            else{
                char top = stack.peek();
                boolean isFirstUpperCase = Character.isUpperCase(top);
                int firstChar = isFirstUpperCase ? top-'A' : top-'a';
                boolean isSecondUpperCase = Character.isUpperCase(s.charAt(i));
                int secondChar = isSecondUpperCase ? s.charAt(i)-'A' : s.charAt(i)-'a';
                
                if(firstChar == secondChar && isFirstUpperCase != isSecondUpperCase)
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