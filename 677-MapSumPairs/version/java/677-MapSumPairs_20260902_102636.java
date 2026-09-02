// Last updated: 02/09/2026, 10:26:36
1class MapSum {
2    class TrieNode {
3        Map<Character, TrieNode> children;
4        boolean isWord;
5        int value;
6
7        public TrieNode() {
8            children = new HashMap<Character, TrieNode>();
9            isWord = false;
10            value = 0;
11        }
12    }
13    
14    TrieNode root;
15    
16    /** Initialize your data structure here. */
17    public MapSum() {
18        root = new TrieNode();
19    }
20    
21    public void insert(String key, int val) {
22        TrieNode curr = root;
23        for (char c : key.toCharArray()) {
24            TrieNode next = curr.children.get(c);
25            if (next == null) {
26                next = new TrieNode();
27                curr.children.put(c, next);
28            }
29            curr = next;
30        }
31        curr.isWord = true;
32        curr.value = val;
33    }
34    
35    public int sum(String prefix) {
36        TrieNode curr = root;
37	for (char c : prefix.toCharArray()) {
38	    TrieNode next = curr.children.get(c);
39	    if (next == null) {
40	        return 0;
41	    }
42	    curr = next;
43        }
44		
45        return dfs(curr);
46    }
47    
48    private int dfs(TrieNode root) {
49        int sum = 0;
50        for (char c : root.children.keySet()) {
51            sum += dfs(root.children.get(c));
52        }
53        return sum + root.value;
54    }
55}