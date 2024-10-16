class Solution {
    static class Pair{
        char ch;
        int count;
        public Pair(char ch, int count){
            this.ch = ch;
            this.count = count;
        }
    }
    public String longestDiverseString(int a, int b, int c) {
       PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p2.count - p1.count); 
        
        if(a > 0)
            pq.add(new Pair('a', a));
        if(b > 0)
            pq.add(new Pair('b', b));
        if(c > 0)
            pq.add(new Pair('c', c));
        
        StringBuilder str = new StringBuilder();
        int l = 0;
        
        while(!pq.isEmpty()){
            Pair x = pq.poll();
            char ch = x.ch;
            int count = x.count;
            
            if(l >= 2 && str.charAt(l-1) == ch && str.charAt(l-2) == ch){
                
                if(pq.isEmpty())
                    break;
                
                Pair y = pq.poll();
                char newChar = y.ch;
                int newCount = y.count;
                str.append(newChar);
                l++;
                if(newCount - 1 > 0)
                    pq.add(new Pair(newChar, newCount-1));
            }
            
            str.append(ch);
            l++;
            if(count-1 > 0)
                pq.add(new Pair(ch, count-1));
        }
        return str.toString();
    }
}