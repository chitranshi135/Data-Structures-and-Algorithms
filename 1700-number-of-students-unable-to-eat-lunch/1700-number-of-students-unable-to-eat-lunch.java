class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < students.length; i++){
            queue.offer(students[i]);
            stack.push(sandwiches[students.length-1-i]);
        }
        
        int skip = 0;
        while(!queue.isEmpty() && skip < queue.size()){
            if(queue.peek() == stack.peek()){
                queue.poll();
                stack.pop();
                skip = 0;
            }
            else{
                queue.offer(queue.poll());
                skip++;
            }
        }
        return queue.size();
    }
}