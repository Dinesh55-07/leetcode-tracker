// Last updated: 20/07/2026, 12:03:24
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        Map<Node, Node> hashMap = new HashMap<>();
19        Node cur = head;
20
21        while (cur != null) {
22            hashMap.put(cur, new Node(cur.val));
23            cur = cur.next;
24        }
25
26        cur = head;
27
28        while (cur != null) {
29            Node copy = hashMap.get(cur);
30            copy.next = hashMap.get(cur.next);
31            copy.random = hashMap.get(cur.random);
32            cur = cur.next;
33        }
34
35        return hashMap.get(head);        
36    }
37}