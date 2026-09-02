// Last updated: 02/09/2026, 09:30:39
1class WordDictionary {
2    private WordDictionary[] children;
3    boolean isEndOfWord;
4    public WordDictionary() {
5        children = new WordDictionary[26];
6        isEndOfWord = false;
7    }
8    
9    public void addWord(String word) {
10        WordDictionary curr = this;
11        for(char c: word.toCharArray()){
12            if(curr.children[c - 'a'] == null)
13                curr.children[c - 'a'] = new WordDictionary();
14            curr = curr.children[c - 'a'];
15        }
16        curr.isEndOfWord = true;
17    }
18    
19    public boolean search(String word) {
20        WordDictionary curr = this;
21        for(int i = 0; i < word.length(); ++i){
22            char c = word.charAt(i);
23            if(c == '.'){
24                for(WordDictionary ch: curr.children)
25                    if(ch != null && ch.search(word.substring(i+1))) return true;
26                return false;
27            }
28            if(curr.children[c - 'a'] == null) return false;
29            curr = curr.children[c - 'a'];
30        }
31        return curr != null && curr.isEndOfWord;
32    }
33}