class Trie {
    Trie[] children;
    boolean isEnd;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }
}

class Solution {
    public void insert(String word, Trie root)
    {
        Trie curr = root;
        for(int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if(curr.children[ch-'a'] == null)
                curr.children[ch-'a'] = new Trie();
            curr = curr.children[ch-'a'];
        }
        curr.isEnd = true;
    }

    public String replace(String word, Trie root)
    {
        Trie curr = root;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if(curr.children[ch-'a'] == null)
                return word;
            else
            {
                sb.append(ch);
                curr = curr.children[ch-'a'];
            }

            if(curr.isEnd)
                return sb.toString();
        }
        return word;
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        Trie root = new Trie();

        for(int i = 0; i < dictionary.size(); i++)
        {
            insert(dictionary.get(i), root);
        }

        String[] s = sentence.split(" ");

        for(int i = 0; i < s.length; i++)
        {
            s[i] = replace(s[i], root);
        }

        StringBuilder sb = new StringBuilder();
		
        sb.append(s[0]);
		
        for (int i = 1; i < s.length; i++) {
            sb.append(" ");
            sb.append(s[i]);
        }
		
        return sb.toString();
    }
}