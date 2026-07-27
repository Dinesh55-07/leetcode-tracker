// Last updated: 27/07/2026, 09:37:22
1class Node{
2    int key, value;
3    Node prev, next;
4    Node(int key, int value){
5        this.key = key; this.value = value;
6    }
7}
8
9class LRUCache {
10
11    private final int capacity; 
12    private final Map<Integer, Node>map;
13    private final Node head, tail;
14
15    public LRUCache(int capacity) {
16        this.capacity = capacity;
17        this.map = new HashMap<>();
18        head = new Node(0,0);
19        tail = new Node(0,0);
20        head.next = tail;
21        tail.prev = head;
22    }
23    
24    public int get(int key) {
25        if (!map.containsKey(key)) return -1;
26        Node node = map.get(key);
27        remove(node);
28        insertAtFront(node);
29        return node.value;
30    }
31    
32    public void put(int key, int value) {
33        if (map.containsKey(key)){
34            Node node = map.get(key);
35            node.value = value;
36            remove(node);
37            insertAtFront(node);
38        }else{
39            if (map.size() == capacity){
40                Node lru = tail.prev;
41                remove(lru);
42                map.remove(lru.key);
43            }
44            Node newNode = new Node(key, value);
45            insertAtFront(newNode);
46            map.put(key, newNode);
47        }
48    }
49
50    private void remove(Node node){
51        node.prev.next = node.next;
52        node.next.prev = node.prev;
53    }
54
55    private void insertAtFront(Node node){
56        node.next = head.next;
57        node.prev = head;
58        head.next.prev = node;
59        head.next = node;
60    }
61}
62
63/**
64 * Your LRUCache object will be instantiated and called as such:
65 * LRUCache obj = new LRUCache(capacity);
66 * int param_1 = obj.get(key);
67 * obj.put(key,value);
68 */